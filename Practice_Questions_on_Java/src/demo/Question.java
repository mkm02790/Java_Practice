package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Question {

	public static void main(String[] args) {
		
	String string ="In an open letter, Israeli envoy to India Naor Gilon has slammed his compatriot filmmaker Nadav Lapid for his remarks over";
    string.toLowerCase();
	string.trim();
//	char[] chr = string.toCharArray();
	HashSet<String> str = new HashSet<>();
	for(int i =0 ; i<string.length() ;i++) {
	if(str.add(String.valueOf(((CharSequence) str).charAt(i)))) {
		str.add(String.valueOf(((CharSequence) str).charAt(i)));
	}
		
	}
	}
}


