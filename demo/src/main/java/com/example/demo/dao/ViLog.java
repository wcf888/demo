package com.example.demo.dao;
/**
 * 
 * @author 武超凡
 * 	自定义注解类
 *
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ViLog {
	/* 操作事件 */
	String operEvent () default "";
	
	int operType();
}
