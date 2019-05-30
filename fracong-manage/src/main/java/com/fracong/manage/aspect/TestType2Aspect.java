package com.fracong.manage.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.fracong.manage.test.annotation.NeedAspest;

/**
 * 使用注解进行AOP
 * @author fracong
 *
 */
@Aspect
@Component
public class TestType2Aspect {
	private final String POINT_CUT = "@annotation(com.fracong.manage.test.annotation.NeedAspestOnMethod)";
	@Pointcut(POINT_CUT)
	public void testType2Aspect(){
		
	}
	@Around("testType2Aspect()")
	public Object doAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		try{
			Object[] args = proceedingJoinPoint.getArgs();
			Method method = ((MethodSignature) proceedingJoinPoint.getSignature()).getMethod();
			NeedAspest annotation = method.getAnnotation(NeedAspest.class);
			if(annotation==null){
				System.err.println("方式二：该注解不存在");
			}else{
				boolean ifNeed = annotation.ifNeed();
				if(ifNeed){
					System.err.println("方式二：需要");
				}else{
					System.err.println("方式二：不需要");
				}
			}
			Object returnVlaue = proceedingJoinPoint.proceed(args);
	        return returnVlaue;
		}catch(Exception e){
			
		}
		return null;
	}
}
