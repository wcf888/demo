package com.example.demo.dao;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SysLogAspect {
	private static final Logger log = LoggerFactory.getLogger(SysLogAspect.class);
	
}
