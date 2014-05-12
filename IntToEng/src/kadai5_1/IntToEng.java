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
		 	int m = n;
		 	int s, t;
		 	String c = "";
		 	if(m>=100 && m<1000) {
		 		s = m/100;
		 		m = m%100;
		 		if(m==0) {
		 			return a[s]+" handred";
		 		}
		 		c = a[s]+" handred ";
		 	}
		 	if(m>19 && m<100) {
		 		s = m/10;
		 		t = m%10;
		 		if(t==0) {
		 			return b[s-2];
		 		}
		 	c += b[s-2]+  " " + a[t];
		 	return c;
		 	}
		 	
	        return a[n];
		 	}
	 }
