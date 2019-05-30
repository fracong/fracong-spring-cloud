package com.fracong.manage.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.fracong.manage.test.annotation.MessageAnnotation;
import com.fracong.manage.test.annotation.NeedAspest;

/**
 * 使用注解进行AOP
 * @author fracong
 *
 */
@Aspect
@Component
public class TestType3Aspect {
	private final String POINT_CUT = "@annotation(com.fracong.manage.test.annotation.MessageAnnotation)";
	@Pointcut(POINT_CUT)
	public void testType3Aspect(){
		
	}
	@Around("testType3Aspect()&&@annotation(messageAnnotation)")
	public Object doAspect(ProceedingJoinPoint proceedingJoinPoint, MessageAnnotation messageAnnotation) throws Throwable{
		try{
			Object[] args = proceedingJoinPoint.getArgs();
			System.err.println("方式三："+messageAnnotation.getMessage());
			Method method = ((MethodSignature) proceedingJoinPoint.getSignature()).getMethod();
			NeedAspest annotation = method.getAnnotation(NeedAspest.class);
			if(annotation==null){
				System.err.println("方式三：该注解不存在");
			}else{
				boolean ifNeed = annotation.ifNeed();
				if(ifNeed){
					System.err.println("方式三：需要");
				}else{
					System.err.println("方式三：不需要");
				}
			}
			Object returnVlaue = proceedingJoinPoint.proceed(args);
	        return returnVlaue;
		}catch(Exception e){
			
		}
		return null;
	}
}
