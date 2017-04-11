package com.zj.lab;

import javax.swing.plaf.synth.Region;

public class TestSpilt {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String tmp="\"[{\"latitude\":\"40.56345097921634\",\"longitude\":\"120.11863256511693\"}, {\"latitude\":\"40.94690226962915\",\"longitude\":\"124.99671006995432\"}]\"";
		String [] tmp1 = tmp.split("\"");
		for(String a :tmp1){
			System.out.println(a);
		}
		int i= 3;
		while(i<tmp1.length-4){
			sb.append(tmp1[i]+",");
			sb.append(tmp1[i+4]+";");
			i+=8;
		}
		System.out.println(sb.toString());
	}
	

}
