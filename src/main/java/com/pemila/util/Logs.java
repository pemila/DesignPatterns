package com.pemila.util;

import org.slf4j.LoggerFactory;

/**
 * 
 * @author 月在未央
 * @date 2018年9月13日上午11:38:50
 */
public class Logs {
	public static void error(String msg) {
		LoggerFactory.getLogger(getClassName()).error(msg);
	}

	public static void error(String msg, Object... obj) {
		LoggerFactory.getLogger(getClassName()).error(msg, obj);
	}

	public static void warn(String msg) {
		LoggerFactory.getLogger(getClassName()).error(msg);
	}

	public static void warn(String msg, Object... obj) {
		LoggerFactory.getLogger(getClassName()).error(msg, obj);
	}

	public static void info(String msg) {
		LoggerFactory.getLogger(getClassName()).info(msg);
	}

	public static void info(String msg, Object... obj) {
		LoggerFactory.getLogger(getClassName()).info(msg, obj);
	}

	public static void debug(String msg) {
		LoggerFactory.getLogger(getClassName()).debug(msg);
	}

	public static void debug(String msg, Object... obj) {
		LoggerFactory.getLogger(getClassName()).debug(msg, obj);
	}

	// 获取调用 error,info,debug静态类的类名
	private static String getClassName() {
		return new SecurityManager() {
			public String getClassName() {
				return getClassContext()[3].getName();
			}
		}.getClassName();
	}
	
	// 获取调用的方法名称
	public static String Mehtod() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}
}
