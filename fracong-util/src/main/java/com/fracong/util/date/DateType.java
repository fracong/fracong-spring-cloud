package com.fracong.util.date;

public enum DateType {
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	TYPE_1("yyyy-MM-dd HH:mm:ss"),
	/**
	 * yyyyMMddHHmmssSSS
	 */
	TYPE_2("yyyyMMddHHmmssSSS"),
	/**
	 * yyyy-MM-dd
	 */
	TYPE_3("yyyy-MM-dd"),
	/**
	 * HH:mm:ss
	 */
	TYPE_4("HH:mm:ss"),
	/**
	 * yyyyMMdd
	 */
	TYPE_5("yyyyMMdd"),
	/**
	 * yyyy年MM月dd日
	 */
	TYPE_6("yyyy年MM月dd日"),
	/***
	 * yyyy年MM月dd日 HH时mm分ss秒
	 */
	TYPE_7("yyyy年MM月dd日 HH时mm分ss秒"),
	/**
	 * yyyyMMdd HHmmss
	 */
	TYPE_8("yyyyMMdd HHmmss"),
	/**
	 * yyyy-MM-dd HH:mm:00
	 */
	TYPE_9("yyyy-MM-dd HH:mm:00"),
	;
	private String dateTypeString;
	
	private DateType(String dateTypeString) {
		this.dateTypeString = dateTypeString;
	}
	public String getDateTypeString() {
		return dateTypeString;
	}
}
