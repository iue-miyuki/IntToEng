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
		 	String[] d = {"thousand","million","billion"};
		 	String[] e = {"one","ten","hundred"};
		 	int m = n;
		 	int l = n;
		 	int s, t;
		 	int x = 0;
		 	int y;
		 	String c = "";
		 	String p = "";
		 	if(m>=1000 && m<1000000) {
		 		s = m;
		 		m = m%100;
		 		if(m==0) {
		 			while(l>0) { 
		 				l=l/10;
		 				x++;
		 				}
		 			y = (x-1)/3;
		 			if(x==4) p += e[0];
		 			if(x==5) p += e[1];
		 			if(x==6) p += e[2];
		 			p += " "+d[y-1];
		 			return p;		 			
		 		}
		 	}
		 	if(m>=100 && m<1000) {
		 		s = m/100;
		 		m = m%100;
		 		if(m==0) {
		 			return a[s]+" hundred";
		 		}
		 		c = a[s]+" hundred ";
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
