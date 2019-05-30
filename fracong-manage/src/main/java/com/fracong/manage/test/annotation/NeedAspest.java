package com.fracong.manage.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)//注解加载方法上
public @interface NeedAspest {
	boolean ifNeed() default true; 
}
