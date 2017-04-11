package com.zj.lab;

public class TestGPS {
	static double gps2d(double lat_a, double lng_a, double lat_b, double lng_b) {
		double d = 0;
		lat_a = lat_a * Math.PI / 180;
		lng_a = lng_a * Math.PI / 180;
		lat_b = lat_b * Math.PI / 180;
		lng_b = lng_b * Math.PI / 180;

		d = Math.sin(lat_a) * Math.sin(lat_b) + Math.cos(lat_a) * Math.cos(lat_b) * Math.cos(lng_b - lng_a);
		d = Math.sqrt(1 - d * d);
		d = Math.cos(lat_b) * Math.sin(lng_b - lng_a) / d;
		d = Math.asin(d) * 180 / Math.PI;
System.out.println(d);
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 gps2d(-89, 0, 89, 0);
 String a=null;
 int [] c = {12,2,3,4};
 
 System.out.println(a);
	}

}
