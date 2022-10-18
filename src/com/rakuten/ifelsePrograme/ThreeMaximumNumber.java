package com.rakuten.ifelsePrograme;

public class ThreeMaximumNumber {
public static void main(String[] args) {
	int num1 = 67;
	int num2 = 34;
	int num3 = 45;
	if(num1>num2&&num1>num3){
		System.out.println(num1 + " is maximum number");
		
	}
	else if(num2>num1&&num2>num3){
		System.out.println(num2  + " is maximum number");
		
	}
	else{
		System.out.println(num3  + " is maximum number");
	}
}
}
