package com.rakuten.ifelsePrograme;

public class CheckAlphabet {
public static void main(String[] args) {
	char c = 'D';
	if((c>='a'&& c<='z')||(c>='A'&&c<='Z')){
		System.out.println(c + " is alphabet");
	}
	else{
		System.out.println(c + " is not alphabet");
	}
}
}
