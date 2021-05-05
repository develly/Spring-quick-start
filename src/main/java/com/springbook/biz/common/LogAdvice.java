package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
	public void printLog(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
	
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작, 호출한 method 이름: " + methodName
				+ ", Args :" + args[0].toString());
	}
}
