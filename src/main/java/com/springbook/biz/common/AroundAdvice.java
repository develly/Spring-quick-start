package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// AroundAdvice는 비즈니스 메소드의 호출을 가로챔
// 클라이언트 호출한 비즈니스 메소드 호출하기 위해서 proceedinJoinpoint 객체를 매개변수로 받아야함
public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[Around BEFORE]: 비즈니스 메소드 수행 전에 처리할 내용");
		String method = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		
		stopWatch.start();
		// proceed를 기준으로 before 역할과 after 역할이 갈림
		Object returnObj = pjp.proceed(); // 비즈니스 메소드 호출 
		stopWatch.stop();
		
		System.out.println("[Around AFTER]: 비즈니스 메소드 수행 후에 처리할 내용");
		System.out.println("[Around stopWatch]: " + stopWatch.getTotalTimeMillis()
		+ "(ms)초");
		
		return returnObj;
	}

}
