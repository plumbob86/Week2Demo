package controller;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(2,2));
		System.out.println(cal.subtract(2,2));
	}

	public int subtract(int i, int j) {
		return i-j;
		
	}

	public int add(int i, int j) {
		return i+j;
		
	}

	public int multiply(int i, int j) {
		
		return i*j;
	}

	public boolean isDuplicateVowel(String string) {
		if(string != null && (string.contains("ee") || string.contains("oo"))) {
			return true;
		}
		return false;
	}

}
