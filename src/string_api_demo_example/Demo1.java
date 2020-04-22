package string_api_demo_example;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		String s1="hello";
		System.out.println(s1.equals("hello"));
		System.out.println(s1.equals("HeLLo"));
		System.out.println(s1.equalsIgnoreCase("HeLLo"));
		System.out.println(s1.startsWith("hee"));
		System.out.println(s1.endsWith("lo"));
		System.out.println(s1.contains("ell"));
		System.out.println(s1.contains("elol"));
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		for (int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		char c[]=s1.toCharArray();
		System.out.println(Arrays.toString(c));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(2,4));
		s1="  iiijijuhregnfm v";
		System.out.println(s1);
		System.out.println(s1.trim());
		String s= " hello hi how are you doing?";
		String ar[]=s.split(" ");
		for(int i =0;i<ar.length;i++) {
			System.out.println(ar[i].toUpperCase());
		}
	}

}
