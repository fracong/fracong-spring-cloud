package com.fracong.shardingjdbc.test.entity;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class LocalDateTimeEntity {

	/*出参：返回给前端数据进行格式化，只需要使用@JsonFormat注解，使用LocalDateTime类型接收数据*/
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime localDateTime;
	/*入参：前端请求的数据进行格式化，使用@DateTimeFormat和@JsonFormat注解，且只能使用Date类型接收数据*/
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date localDateTime2;

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Date getLocalDateTime2() {
		return localDateTime2;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	public void setLocalDateTime2(Date localDateTime2) {
		this.localDateTime2 = localDateTime2;
	}
}
