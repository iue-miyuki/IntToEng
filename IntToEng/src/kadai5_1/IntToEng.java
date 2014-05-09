package kadai5_1;

import java.util.Scanner;

public class IntToEng {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        System.out.println(translateEng(input));	        
}
	 
	 static String translateEng(int n) {
		 	String[] a = {"zero","one","two","three","four",
		 			"five","six","seven","eight","nine",
		 			"ten","eleven","twelve","thirteen",
		 			"fourteen","fifteen","sixteen","seventeen",
		 			"eighteen","nineteen"};
		 	
		 	String[] b = {"twenty","thirty","forty","fifty",
		 			"sixty","seventy","eighty","ninety"};
		 	
		 	if(n>19) {
		 		int s = n/10;
		 		int t = n%10;
		 		if(t==0) {
		 			return b[s-2];
		 		}
		 	String c = b[s-2]+  " " + a[t];
		 	return c;
		 	}
		 	
	        return a[n];
	 }
}
