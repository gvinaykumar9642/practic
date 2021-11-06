package com.createcontactwithbaseclass;

public class jp_01_reverseString {

	public static void main(String[] args) {

		String s="java";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
  System.out.println(rev);

	}

}
