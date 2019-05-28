package com.fracong.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

/**
 * LocalDateTime的日期工具类
 * @author fracong 2019-01-28
 *
 */
public class LocalDateTimeUtil {

	/**
	 * 日期转LocalDateTime
	 * 
	 * @param date
	 * @return
	 */
	public static LocalDateTime dateConvertLocalDateTime(Date date) {
		if (null == date)
			return null;
		return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}

	/**
	 * LocalDateTime转日期
	 * 
	 * @param localDateTime
	 * @return
	 */
	public static Date localDateTimeConvertDate(LocalDateTime time) {
		if (null == time)
			return null;
		return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * 获取指定日期的毫秒
	 * 
	 * @param time
	 * @return
	 */
	public static Long getMilliByTime(LocalDateTime time) {
		if (null == time)
			return null;
		return time.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
	}

	/**
	 * 获取指定日期的秒
	 * 
	 * @param time
	 * @return
	 */
	public static Long getSecondsByTime(LocalDateTime time) {
		return time.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
	}

	/**
	 * 获取指定时间的指定格式
	 * 
	 * @param time
	 * @param pattern
	 * @return
	 */
	public static String formatTime(LocalDateTime time, String pattern) {
		return time.format(DateTimeFormatter.ofPattern(pattern));
	}

	/**
	 * 获取当前时间的指定格式
	 * 
	 * @param pattern
	 * @return
	 */
	public static String formatNow(String pattern) {
		return formatTime(LocalDateTime.now(), pattern);
	}

	/**
	 * 日期加上一个数,根据field不同加不同值,field为ChronoUnit.*
	 * 
	 * @param time
	 * @param number
	 * @param field
	 * @return
	 */
	public static LocalDateTime plus(LocalDateTime time, long number, TemporalUnit field) {
		return time.plus(number, field);
	}

	/**
	 * 日期减去一个数,根据field不同减不同值,field参数为ChronoUnit.*
	 * 
	 * @param time
	 * @param number
	 * @param field
	 * @return
	 */
	public static LocalDateTime minu(LocalDateTime time, long number, TemporalUnit field) {
		return time.minus(number, field);
	}

	/**
	 * 获取两个日期的差 field参数为ChronoUnit.*
	 * 
	 * @param startTime
	 * @param endTime
	 * @param field
	 * @return
	 */
	public static long differenceTime(LocalDateTime startTime, LocalDateTime endTime, ChronoUnit field) {
		Period period = Period.between(LocalDate.from(startTime), LocalDate.from(endTime));
		if (field == ChronoUnit.YEARS)
			return period.getYears();
		else if (field == ChronoUnit.MONTHS)
			return period.getYears() * 12 + period.getMonths();
		return field.between(startTime, endTime);
	}

	/**
	 * 获取一天的开始时间，2017,7,22 00:00
	 * 
	 * @param time
	 * @return
	 */
	public static LocalDateTime getDayStartTime(LocalDateTime time) {
		return time.withHour(0).withMinute(0).withSecond(0).withNano(0);
	}

	/**
	 * 获取一天的结束时间，2017,7,22 23:59:59.999999999
	 * 
	 * @param time
	 * @return
	 */
	public static LocalDateTime getDayEndTime(LocalDateTime time) {
		return time.withHour(23).withMinute(59).withSecond(59).withNano(999999999);
	}
}
