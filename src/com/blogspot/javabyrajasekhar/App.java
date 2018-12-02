package com.blogspot.javabyrajasekhar;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {

		findDuplicateWords("java oracle android php jsp java jsp");
		
		findDuplicateCharaters("javaaavvgg");
	}

	private static void findDuplicateCharaters(String string) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for(int i=0;i<=string.length()-1;i++) {
			char character = string.charAt(i);
			
			if(hashMap.get(character) !=null) {
				hashMap.put(character, hashMap.get(character)+1);
			}else {
				hashMap.put(character, 1);
			}
			
			
		}
		System.out.println(hashMap);
	}

	private static void findDuplicateWords(String string) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		String[] splitString = string.split(" ");

		for (String str : splitString) {
			if (hashMap.get(str) != null) {
				hashMap.put(str, hashMap.get(str) + 1);
			} else {
				hashMap.put(str, 1);
			}

		}

		System.out.println(hashMap);
	}

}
