package com.pemila.util;

import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author 月在未央
 * @date 2018年10月28日下午5:35:02	
 */
public class JSON {
	/**
	 * json转换成对象
	 * @param:传入对象，json字符串
	 * @return:Object
	 */
	public static <T> T  toObj(Class<T> clazz,String jsonStr) {
		ObjectMapper mapper = new ObjectMapper();
		T t = null;
	    try {
			t = mapper.readValue(jsonStr, clazz);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return t;
	}
	/**
	 * 对象转换成json
	 * @param:传入对象
	 * @return:json字符串
	 */
	public static String toJson(Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断字符传是否为空，str==null及str只包含空格时均返回true
	 * @param str
	 * @return
	 */
	public static Boolean isBlank(String str){
		if(str==null)
			return true;
		return str.replace(" ","").isEmpty();
	}
}



