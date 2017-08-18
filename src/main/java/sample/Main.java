package sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("Madam");
		System.out.println(isPalindrome(builder));

	}
	
	public static boolean isPalindrome(StringBuilder str) {
		StringBuilder original = new StringBuilder(str);
		return str.reverse().toString().equalsIgnoreCase(original.toString());
		
		
	}

}
