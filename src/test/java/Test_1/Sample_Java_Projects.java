package Test_1;

public class Sample_Java_Projects {
	public static void main(String[] args) {

		// 1. Reverse String

//		String str = "Eclipse";
//		String rev = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			rev += str.charAt(i);
//		}
//
//		System.out.println("Original: " + str);
//		System.out.println("Reversed: " + rev);
		
		
		

		// 2. Using StringBuilder reverse(Reverse string)

//		String str="Eclipse1";
//		String reversed = new StringBuilder(str).reverse().toString();
//		System.out.println("Original:" + str);
//		System.out.println("Reversed:" + reversed);
		
		
		

		// 3. Checking the text is Palindrome

//		String str = "madam";
//		String rev = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			rev += str.charAt(i);
//		}
//
//		if (str.equals(rev))
//			System.out.println("palindrome");
//		else
//			System.out.println("Not palindrome");
		
		
		

		// 4. Checking even or odd

//		int num=7;
//		if(num % 2==0)
//			System.out.println("It is even number");
//		else
//			System.out.println("It is odd number");
		
		
		

		// 5. sum of numbers

//		int a = 5;
//		int b = 10;
//		int sum = a + b;
//
//		System.out.println("Sum of " + a + " and " + b + " is: " + sum);
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Counting: " + i);
//		}
		
		

		// 6. Swap_Two_Numbers_Without_Third_Variable

//		int a=5, b=10;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+","+b);
		
		
		

		// 7. printing numbers from 1-10

//		for (int i=1; i<=10; i++ ) {
//			System.out.println(i);
//		}
		
		
		

		// 8. Print even number from 1-20

//		for (int i=1;i<=20; i++) {
//			if(i%2==0)
//				System.out.println(i);
//		}
		
		
		

		// 9. Count characters in a string

//		String str="Hello World";
//		System.out.println("Length "  +  str.length());
		
		
		

		// 10. Reverse an Integer number

//		int num=1234, rev=0;
//		while(num !=0) {
//			int digit=num %10;
//			rev=rev*10+ digit;
//			num=num/10;
//		}
//		System.out.println("Reversed Number: " + rev);
		
		
		

		// 11. Find the sum of digits in a number

//		int num=1234, sum = 0;
//		while(num > 0) {
//			sum +=num % 10;
//			num =num / 10;
//		}
//		System.out.println("Sum: " + sum);
		
		
		

		// 12. Printing a simple array

//		int arr[]= {1,2,3,4,5};
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		

		// 13. Largest number of three

		int a = 10, b = 20, c = 15;

		if (a > b && a > c)
			System.out.println("A is largest");
		else if (b > a && b > c)
			System.out.println("B is largest");
		else
			System.out.println("C is largest");

	}

}
