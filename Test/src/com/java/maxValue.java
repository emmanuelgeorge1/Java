package com.java;

public class maxValue {
	
	public static Integer max(Integer a,Integer b  ) {
		if(a>b) {
			return a;
		}
		return b;
	}
	
public static void main(String[] args) {
	
	
	System.out.println("The Maximum Value="+ max(43,29));
	
}
}


