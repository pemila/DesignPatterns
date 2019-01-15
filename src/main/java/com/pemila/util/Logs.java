package com.pemila.util;

import org.slf4j.LoggerFactory;

/**
 * 
 * @author 月在未央
 * @date 2018年9月13日上午11:38:50
 */
public class Logs {

	public static void info(String msg) {
		LoggerFactory.getLogger(getClassName()).info(msg);
	}

	public static void info(String msg, Object... obj) {
		LoggerFactory.getLogger(getClassName()).info(msg, obj);
	}

	// 获取调用 error,info,debug静态类的类名
	private static String getClassName() {
		return new SecurityManager() {
			public String getClassName() {
				return getClassContext()[3].getName();
			}
		}.getClassName();
	}
}
