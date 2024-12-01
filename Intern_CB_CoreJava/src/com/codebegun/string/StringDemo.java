package com.codebegun.string;
public class StringDemo {
	public static void main(String[] args) {

		String s1 = "Hello CodeBegun";
		String s2 = "helloCodeBegun";
		String s3 = new String("Hello CodeBegun");

		boolean result = (s2==s3); //type--//value//--//memory location
		System.out.println("==test::"+result);
		System.out.println("Equals Method::" + (s2.equals(s3)));
		System.out.println("Equals Method::"+ (s1.equalsIgnoreCase(s2)));
		System.out.println("Equals charAt:: " + (s2.charAt(7)));
		System.out.println("Equals length::" + (s2.length()));
		System.out.println("Equals lastIndexOf::" +(s2.lastIndexOf('I')));
		System.out.println("Equals split::" +s2.split("B")[0]);
		System.out.println("Equals split::" +s2.split("B")[0]);
		System.out.println(s1); 
		System.out.println(s2);
		s1 ="Hello CodeBegun 123"; 
		System.out.println(s1); //
		System.out.println(s2); 

		System.out.println(s2.endsWith("h"));
		System.out.println(s2.repeat(5));
		System.out.println(s2.replace("o", "O"));
		System.out.println(s2.startsWith("h"));
		System.out.println(s2.endsWith("N"));
		System.out.println(s2.isEmpty());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toCharArray());
	}

}



/*
 * public class StringDemo {
 * 
 * 
 * 
 * 
 * public static void main(String[] args) {
 * 
 * 
 * 
 * // TODO Auto-generated method stub
 * 
 * String s1 = "Hello CodeBegun"; String s2 = "hello CodeBegun";
 * 
 * String s3= new String("Hello CodeBegun");
 * 
 * boolean result = (s2 == s3);// type--//value//--//memory location
 * 
 * System.out.println("== test :: "+result);
 * 
 * System.out.println("Equals Method ::" + (s2.equals(s3)));
 * 
 * System.out.println("Equals Method ::" + (s1.equalsIgnoreCase(s2)));
 * 
 * System.out.println("Equals charAt ::" + (s2.charAt(14)));
 * System.out.println("Equals length ::" +
 * (s2.length()));System.out.println("Equals lastIndexOf::" +
 * (s2.lastIndexOf('I')));
 * 
 * System.out.println("Equals split ::" +s2.split("B")[0]);
 * 
 * System.out.println("Equals split ::" +s2.split("B")[1]);
 * 
 * System.out.println(s1);
 * 
 * System.out.println(s2);
 * 
 * s1 = "Hello CodeBegun 123";
 * 
 * System.out.println(s1);
 * 
 * System.out.println(s2);
 * 
 * }
 * 
 * }
 */