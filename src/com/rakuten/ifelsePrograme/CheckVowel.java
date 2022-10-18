package com.rakuten.ifelsePrograme;

public class CheckVowel {
public static void main(String[] args) {
	char vowl = 'z';
	if(vowl=='a'||vowl=='e'|| vowl=='i'|| vowl=='o'||vowl=='u' || vowl=='A'||vowl=='E'||vowl=='I'||vowl=='O'||vowl=='U'){
		System.out.println(vowl + " is vowel");
	}
	else{
		System.out.println(vowl + " is consonant");
	}
}
}
