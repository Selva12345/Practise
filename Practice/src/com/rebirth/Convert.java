package com.rebirth;

import java.io.UnsupportedEncodingException;

public class Convert {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "12";
		con(s);
	}

	private static void con(String s) throws UnsupportedEncodingException {
		int r=00;
		String.valueOf(r);
		Integer d = Integer.valueOf(s);

		System.out.println(d+" "+String.valueOf(r));
	}
}