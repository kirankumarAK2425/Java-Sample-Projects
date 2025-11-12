package Example;

//public class ReverseString {
//	public static void main(String[] args) {
//
//		String input = "Eclipse1";
//		String reversed = "";
//
//		for (int i = input.length() - 1; i >= 0; i--) {
//			reversed += input.charAt(i);
//		}
//		System.out.println("Original: " + input);
//		System.out.println("Reversed: " + reversed);
//
//	}
//}

//Using StringBuilder reverse()	

//public class ReverseString1 {
//	public static void main(String[] args) {
//
//		String input = "Eclipse";
//		String reversed = new StringBuilder(input).reverse().toString();
//		System.out.println("Original:" + input);
//		System.out.println("Reversed:" + reversed);
//
//	}
//}




//Palindrome

public class ReverseString{
	public static void main (String[] args){
		String input="madam";
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev +=input.charAt(i);
		}
		if (input.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
		
		
		
		
	}

}