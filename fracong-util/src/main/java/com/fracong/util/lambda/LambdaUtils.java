package com.fracong.util.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class LambdaUtils {
	
	/**
	 * 针对list中数据进行排序
	 * 如果T为Bean，则使用Collections.sort(list,(a,b)->(a.getXxxXxx()).compareTo(b.getXxxXxx()))即可，其中XxxXxx为某一字段
	 * @param ifReversed
	 * @param list
	 * @return
	 */
	public <T  extends Comparable<T>> List<T> sortList(boolean ifReversed, List<T> list) {
		if(ifReversed){
			Collections.sort(list,(a,b)->(a.compareTo(b)));
		}else{
			Collections.sort(list,(a,b)->(b.compareTo(a)));
		}
		return list;
	}

	/**
	 * 根据字段对JSONArray进行排序
	 * @param ifReversed
	 * @param jsonArr
	 * @param fieldName
	 * @param cla
	 * @return
	 */
	public JSONArray sortJsonArray(boolean ifReversed, JSONArray jsonArr, String fieldName, Class<?> cla){
		if(String.class.equals(cla)){
			if(ifReversed){
				jsonArr.sort(Comparator.comparing(e->((JSONObject) e).getString(fieldName)).reversed());
			}else{
				jsonArr.sort(Comparator.comparing(e->((JSONObject) e).getString(fieldName)));
			}
		}else if(Date.class.equals(cla)){
			if(ifReversed){
				jsonArr.sort(Comparator.comparing(e->((JSONObject) e).getDate(fieldName)).reversed());
			}else{
				jsonArr.sort(Comparator.comparing(e->((JSONObject) e).getDate(fieldName)));
			}
		}else if(int.class.equals(cla) || Integer.class.equals(cla)){
			if(ifReversed){
				jsonArr.sort(Comparator.comparing(e->((JSONObject) e).getInteger(fieldName)).reversed());
			}else{
				jsonArr.sort(Comparator.comparing(e->((JSONObject) e).getInteger(fieldName)));
			}
		}else if(short.class.equals(cla) || Short.class.equals(cla)){
			if(ifReversed){
				jsonArr.sort(Comparator.comparing(e->((JSONObject) e).getShort(fieldName)).reversed());
			}else{
				jsonArr.sort(Comparator.comparing(e->((JSONObject) e).getShort(fieldName)));
			}
		}
		return jsonArr;
	}
}
