package com.fracong.util.date;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateUtil {
	public enum TimeType {
		TYPE_HH,
		TYPE_mm,
		TYPE_ss;
	}
	
	public static Date getNowDate(DateType dateType) {
		SimpleDateFormat formatter = new SimpleDateFormat(dateType.getDateTypeString());
		String dateString = formatter.format(new Date());
		Date currentTime = formatter.parse(dateString, new ParsePosition(8));
		return currentTime;
	}
	
	public static Date stringConverDate(String dateString, DateType dateType) {
		SimpleDateFormat formatter = new SimpleDateFormat(dateType.getDateTypeString());
		Date currentTime = formatter.parse(dateString, new ParsePosition(8));
		return currentTime;
	}
	
	public static String dateConverString(Date date, DateType dateType) {
		SimpleDateFormat formatter = new SimpleDateFormat(dateType.getDateTypeString());
		String dateString = formatter.format(date);
		return dateString;
	}
	
	/**
	 * 提取一个月中的最后一天
	 *
	 * @param day
	 * @return
	 */
	public static Date getLastDate(long day) {
		Date date = new Date();
		long date_3_hm = date.getTime() - 3600000 * 34 * day;
		Date date_3_hm_date = new Date(date_3_hm);
		return date_3_hm_date;
	}

	/**
	 * 输入一个整数类型的字符串, 然后转换成时分秒的形式输出 例如：输入568 返回结果为：00:09:28
	 * 输入null或者“” 返回结果为:00:00:00
	 * @param value
	 * @return
	 */
	public static String getHhMmSs(String value) {
		String hour = "00";
		String minute = "00";
		String second = "00";
		if (value != null && !value.trim().equals("")) {
			int v_int = Integer.valueOf(value);
			hour = v_int / 3600 + "";// 获得小时;
			minute = v_int % 3600 / 60 + "";// 获得小时;
			second = v_int % 3600 % 60 + "";// 获得小时;
		}
		return (hour.length() > 1 ? hour : "0" + hour) + ":" + (minute.length() > 1 ? minute : "0" + minute) + ":"
				+ (second.length() > 1 ? second : "0" + second);
	}

	/**
	 * 得到现在小时 2018-02-02 02:02:02
	 */
	public static String getNowTimeByType(TimeType type) {
		SimpleDateFormat formatter = new SimpleDateFormat(DateType.TYPE_1.getDateTypeString());
		if(TimeType.TYPE_HH.equals(type))
			return formatter.format(new Date()).substring(11, 13);
		else if(TimeType.TYPE_mm.equals(type))
			return formatter.format(new Date()).substring(14, 16);
		else if(TimeType.TYPE_ss.equals(type))
			return formatter.format(new Date()).substring(17, 19);
		return null;
	}
	

	/**
	 * 二个小时时间间的差值,必须保证二个时间都是"HH:MM"的格式，返回字符型的分钟
	 */
	public static String getTwoHour(String st1, String st2) {
		String[] kk = null;
		String[] jj = null;
		kk = st1.split(":");
		jj = st2.split(":");
		if (Integer.parseInt(kk[0]) < Integer.parseInt(jj[0]))
			return "0";
		else {
			double y = Double.parseDouble(kk[0]) + Double.parseDouble(kk[1]) / 60;
			double u = Double.parseDouble(jj[0]) + Double.parseDouble(jj[1]) / 60;
			if ((y - u) > 0)
				return y - u + "";
			else
				return "0";
		}
	}

	/**
	 * 得到二个日期间的间隔天数
	 */
	public static String getTwoDay(String dateString1, String dateString2) {
		SimpleDateFormat formatter = new SimpleDateFormat(DateType.TYPE_3.getDateTypeString());
		long day = 0;
		try {
			Date date1 = formatter.parse(dateString1);
			Date date2 = formatter.parse(dateString2);
			day = (date1.getTime() - date2.getTime()) / (24 * 60 * 60 * 1000);
		} catch (Exception e) {
			return "";
		}
		return day + "";
	}

	/**
	 * 时间前推或后推分钟,其中JJ表示分钟.
	 */
	public static String getPreTime(String sj1, String jj) {
		SimpleDateFormat format = new SimpleDateFormat(DateType.TYPE_1.getDateTypeString());
		String mydate1 = "";
		try {
			Date date1 = format.parse(sj1);
			long Time = (date1.getTime() / 1000) + Integer.parseInt(jj) * 60;
			date1.setTime(Time * 1000);
			mydate1 = format.format(date1);
		} catch (Exception e) {
		}
		return mydate1;
	}

	/**
	 * 得到一个时间延后或前移几天的时间,nowdate(yyyy-mm-dd)为时间,delay为前移或后延的天数
	 */
	public static String getNextDay(String nowdate, String delay) {
		SimpleDateFormat format = new SimpleDateFormat(DateType.TYPE_3.getDateTypeString());
		try {
			String mdate = "";
			Date d = stringConverDate(nowdate, DateType.TYPE_3);
			long myTime = (d.getTime() / 1000) + Integer.parseInt(delay) * 24 * 60 * 60;
			d.setTime(myTime * 1000);
			mdate = format.format(d);
			return mdate;
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * 功能：
	 * 距离现在几天的时间是多少 获得一个时间字符串，格式为：yyyy-MM-dd HH:mm:ss day 如果为整数，表示未来时间
	 * 如果为负数，表示过去时间
	 *
	 */
	public static String getFromNow(int day) {
		SimpleDateFormat format = new SimpleDateFormat(DateType.TYPE_1.getDateTypeString());
		Date date = new Date();
		long dateTime = (date.getTime() / 1000) + day * 24 * 60 * 60;
		date.setTime(dateTime * 1000);
		return format.format(date);
	}

	/**
	 * 判断是否润年
	 *
	 * @param ddate
	 * @return
	 */
	public static boolean isLeapYear(String dateString) {

		/**
		 * 详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
		 * 3.能被4整除同时能被100整除则不是闰年
		 */
		Date d = stringConverDate(dateString, DateType.TYPE_3);
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		gc.setTime(d);
		int year = gc.get(Calendar.YEAR);
		if ((year % 400) == 0)
			return true;
		else if ((year % 4) == 0) {
			if ((year % 100) == 0)
				return false;
			else
				return true;
		} else
			return false;
	}

	/**
	 * 返回美国时间格式 26 Apr 2006
	 *
	 * @param str
	 * @return
	 */
	public static String getEDate(String str) {
		SimpleDateFormat format = new SimpleDateFormat(DateType.TYPE_3.getDateTypeString());
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = format.parse(str, pos);
		String j = strtodate.toString();
		String[] k = j.split(" ");
		return k[2] + k[1].toUpperCase() + k[5].substring(2, 4);
	}

	/**
	 * 获取一个月的最后一天
	 *
	 * @param dat
	 * @return
	 */
	public static String getEndDateOfMonth(String dat) {// yyyy-MM-dd
		String str = dat.substring(0, 8);
		String month = dat.substring(5, 7);
		int mon = Integer.parseInt(month);
		if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
			str += "31";
		} else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			str += "30";
		} else {
			if (isLeapYear(dat)) {
				str += "29";
			} else {
				str += "28";
			}
		}
		return str;
	}

	/**
	 * 判断二个时间是否在同一个周
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean isSameWeekDates(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(date1);
		cal2.setTime(date2);
		int subYear = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);
		if (0 == subYear) {
			if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
				return true;
		} else if (1 == subYear && 11 == cal2.get(Calendar.MONTH)) {
			// 如果12月的最后一周横跨来年第一周的话则最后一周即算做来年的第一周
			if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
				return true;
		} else if (-1 == subYear && 11 == cal1.get(Calendar.MONTH)) {
			if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
				return true;
		}
		return false;
	}

	/**
	 * 产生周序列,即得到当前时间所在的年度是第几周
	 *
	 * @return
	 */
	public static String getSeqWeek() {
		Calendar c = Calendar.getInstance(Locale.CHINA);
		String week = Integer.toString(c.get(Calendar.WEEK_OF_YEAR));
		if (week.length() == 1)
			week = "0" + week;
		String year = Integer.toString(c.get(Calendar.YEAR));
		return year + week;
	}

	/**
	 * 获得一个日期所在的周的星期几的日期，如要找出2002年2月3日所在周的星期一是几号
	 *
	 * @param dateString
	 * @param num
	 * @return
	 */
	public static String getWeek(String dateString, String num) {
		// 再转换为时间
		Date dd = DateUtil.stringConverDate(dateString, DateType.TYPE_3);
		Calendar c = Calendar.getInstance();
		c.setTime(dd);
		if (num.equals("1")) // 返回星期一所在的日期
			c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		else if (num.equals("2")) // 返回星期二所在的日期
			c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		else if (num.equals("3")) // 返回星期三所在的日期
			c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		else if (num.equals("4")) // 返回星期四所在的日期
			c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		else if (num.equals("5")) // 返回星期五所在的日期
			c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		else if (num.equals("6")) // 返回星期六所在的日期
			c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		else if (num.equals("0")) // 返回星期日所在的日期
			c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return new SimpleDateFormat(DateType.TYPE_3.getDateTypeString()).format(c.getTime());
	}

	/**
	 * 根据一个日期，返回是星期几的字符串
	 *
	 * @param sdate
	 * @return
	 */
	public static String getWeek(String dateString) {
		// 再转换为时间
		Date date = DateUtil.stringConverDate(dateString, DateType.TYPE_3);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return new SimpleDateFormat("EEEE").format(c.getTime());
	}

	public static String getWeekStr(String dateString) {
		String str = "";
		str = DateUtil.getWeek(dateString);
		if ("1".equals(str)) {
			str = "星期日";
		} else if ("2".equals(str)) {
			str = "星期一";
		} else if ("3".equals(str)) {
			str = "星期二";
		} else if ("4".equals(str)) {
			str = "星期三";
		} else if ("5".equals(str)) {
			str = "星期四";
		} else if ("6".equals(str)) {
			str = "星期五";
		} else if ("7".equals(str)) {
			str = "星期六";
		}
		return str;
	}

	/**
	 * 两个时间之间的天数
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static long getDays(String date1, String date2) {
		SimpleDateFormat format = new SimpleDateFormat(DateType.TYPE_3.getDateTypeString());
		if (date1 == null || date1.equals(""))
			return 0;
		if (date2 == null || date2.equals(""))
			return 0;
		// 转换为标准时间
		java.util.Date date = null;
		java.util.Date mydate = null;
		try {
			date = format.parse(date1);
			mydate = format.parse(date2);
		} catch (Exception e) {
		}
		long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
		return day;
	}

	/**
	 * 形成如下的日历 ， 根据传入的一个时间返回一个结构 星期日 星期一 星期二 星期三 星期四 星期五 星期六 下面是当月的各个时间
	 * 此函数返回该日历第一行星期日所在的日期
	 *
	 * @param sdate
	 * @return
	 */
	public static String getNowMonth(String sdate) {
		// 取该时间所在月的一号
		sdate = sdate.substring(0, 8) + "01";

		// 得到这个月的1号是星期几
		Date date = DateUtil.stringConverDate(sdate,DateType.TYPE_3);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int u = c.get(Calendar.DAY_OF_WEEK);
		String newday = DateUtil.getNextDay(sdate, (1 - u) + "");
		return newday;
	}

	/***************************************************************************
	 * //nd=1表示返回的值中包含年度 //yf=1表示返回的值中包含月份 //rq=1表示返回的值中包含日期 //format表示返回的格式 1
	 * 以年月日中文返回 2 以横线-返回 // 3 以斜线/返回 4 以缩写不带其它符号形式返回 // 5 以点号.返回
	 **************************************************************************/
	public static String getStringDateMonth(String sdate, String nd, String yf, String rq, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(DateType.TYPE_3.getDateTypeString());
		Date currentTime = new Date();
		String dateString = formatter.format(currentTime);
		String s_nd = dateString.substring(0, 4); // 年份
		String s_yf = dateString.substring(5, 7); // 月份
		String s_rq = dateString.substring(8, 10); // 日期
		String sreturn = "";
		// roc.util.MyChar mc = new roc.util.MyChar();
		// if (sdate == null || sdate.equals("") || !mc.Isdate(sdate)) { //
		// 处理空值情况
		if (sdate == null || sdate.equals("")) {
			if (nd.equals("1")) {
				sreturn = s_nd;
				// 处理间隔符
				if (format.equals("1"))
					sreturn = sreturn + "年";
				else if (format.equals("2"))
					sreturn = sreturn + "-";
				else if (format.equals("3"))
					sreturn = sreturn + "/";
				else if (format.equals("5"))
					sreturn = sreturn + ".";
			}
			// 处理月份
			if (yf.equals("1")) {
				sreturn = sreturn + s_yf;
				if (format.equals("1"))
					sreturn = sreturn + "月";
				else if (format.equals("2"))
					sreturn = sreturn + "-";
				else if (format.equals("3"))
					sreturn = sreturn + "/";
				else if (format.equals("5"))
					sreturn = sreturn + ".";
			}
			// 处理日期
			if (rq.equals("1")) {
				sreturn = sreturn + s_rq;
				if (format.equals("1"))
					sreturn = sreturn + "日";
			}
		} else {
			// 不是空值，也是一个合法的日期值，则先将其转换为标准的时间格式
			sdate = getOKDate(sdate);
			s_nd = sdate.substring(0, 4); // 年份
			s_yf = sdate.substring(5, 7); // 月份
			s_rq = sdate.substring(8, 10); // 日期
			if (nd.equals("1")) {
				sreturn = s_nd;
				// 处理间隔符
				if (format.equals("1"))
					sreturn = sreturn + "年";
				else if (format.equals("2"))
					sreturn = sreturn + "-";
				else if (format.equals("3"))
					sreturn = sreturn + "/";
				else if (format.equals("5"))
					sreturn = sreturn + ".";
			}
			// 处理月份
			if (yf.equals("1")) {
				sreturn = sreturn + s_yf;
				if (format.equals("1"))
					sreturn = sreturn + "月";
				else if (format.equals("2"))
					sreturn = sreturn + "-";
				else if (format.equals("3"))
					sreturn = sreturn + "/";
				else if (format.equals("5"))
					sreturn = sreturn + ".";
			}
			// 处理日期
			if (rq.equals("1")) {
				sreturn = sreturn + s_rq;
				if (format.equals("1"))
					sreturn = sreturn + "日";
			}
		}
		return sreturn;
	}

	public static String getNextMonthDay(String sdate, int m) {
		sdate = getOKDate(sdate);
		int year = Integer.parseInt(sdate.substring(0, 4));
		int month = Integer.parseInt(sdate.substring(5, 7));
		month = month + m;
		if (month < 0) {
			month = month + 12;
			year = year - 1;
		} else if (month > 12) {
			month = month - 12;
			year = year + 1;
		}
		String smonth = "";
		if (month < 10)
			smonth = "0" + month;
		else
			smonth = "" + month;
		return year + "-" + smonth + "-10";
	}

	/**
	 * 功能：
	 */
	public static String getOKDate(String sdate) {
		SimpleDateFormat formatter = new SimpleDateFormat(DateType.TYPE_3.getDateTypeString());
		if (sdate.length() == 8)
			sdate = sdate.substring(0, 4) + "-" + sdate.substring(4, 6) + "-" + sdate.substring(6, 8);
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(sdate, pos);
		String dateString = formatter.format(strtodate);
		return dateString;
	}

	/**
	 * 获取当前时间的前一天时间
	 *
	 * @param cl
	 * @return
	 */
	public static String getBeforeDay(Calendar cl) {
		SimpleDateFormat formatter = new SimpleDateFormat(DateType.TYPE_3.getDateTypeString());
		cl.add(Calendar.DATE, -1);
		return formatter.format(cl.getTime());
	}

	/**
	 * 获取当前时间的后一天时间
	 *
	 * @param cl
	 * @return
	 */
	public static String getAfterDay(Calendar cl) {
		SimpleDateFormat formatter = new SimpleDateFormat(DateType.TYPE_3.getDateTypeString());
		cl.add(Calendar.DATE, 1);
		return formatter.format(cl.getTime());
	}

	public static String getDateAMPM() {
		GregorianCalendar ca = new GregorianCalendar();
		// 结果为“0”是上午 结果为“1”是下午
		int i = ca.get(GregorianCalendar.AM_PM);
		return i == 0 ? "AM" : "PM";
	}
	
	/**
	 * 将时间推几分钟
	 * @param 当前时间
	 * @return
	 * @throws Exception
	 */
	public static Date handleBeginDateMinute(Date date,Integer minuteNum) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat(DateType.TYPE_9.getDateTypeString());
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE)+minuteNum);
        Date beginDate = calendar.getTime();
        beginDate = sdf.parse(sdf.format(beginDate));
		return beginDate;
	}
	
	/**
	 * 将时间推几小时
	 * @param 当前时间
	 * @return
	 * @throws Exception
	 */
	public static Date handleBeginDateHour(Date date,Integer hourNum) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat(DateType.TYPE_9.getDateTypeString());
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY)+hourNum);
        Date beginDate = calendar.getTime();
        beginDate = sdf.parse(sdf.format(beginDate));
		return beginDate;
	}
}
