package com.yin.gava;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class Hello {

	public static void main(String[] args) {
		BiMap<String, String> bm = HashBiMap.create();
		bm.put("name", "уехЩ");
		bm.put("age", "20");
		
		String s = bm.inverse().get("20");
		System.out.println(s);
		
		long start = System.currentTimeMillis();
		String str = "abc,efef,dfewfe,etge455";
		for(int i=0; i<10000000; i++){
			str.split(",");
//			Splitter.on(',').split(str);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
//		Splitter.on(',').split(str);
//		System.out.println(Strings.padStart("", 10, 'c'));
//		String s1 = Strings.repeat("abc", 3);
//		System.out.println(s1);

	}

}
