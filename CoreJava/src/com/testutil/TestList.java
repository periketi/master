package com.testutil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		String s = new String("RAVI");
		s.concat("SHANKAR");
		System.out.println("string====="+s);
		StringBuffer sb = new StringBuffer("RAVI");
		sb.append("SHANKAR");
		System.out.println("StringBuffer====="+sb);
		List<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Siri");
		list.add("Ishu");
		list.add("Tammu");
		System.out.println(list);
		//System.out.println(list.get(3));
		//System.out.println(getElementAtLoc(5, list));
	}

	public static String getElementAtLoc(int i, List<String> list) {

		String element = null;

		Iterator<String> itr = list.iterator();
		int index = 0;
		if(i>list.size()){
			throw (new ArrayIndexOutOfBoundsException());
		}
		while (itr.hasNext()) {
			element = itr.next();
		/*	System.out.println("element----"+element);
			System.out.println("index----"+index);*/
			index++;
			if(index==i){
				break;
			}
		}
		

		return element;

	}

}
