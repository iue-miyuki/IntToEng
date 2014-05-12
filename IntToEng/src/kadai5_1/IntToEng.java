package kadai5_1;

import java.util.Scanner;

public class IntToEng {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        System.out.println(translateEng(input));	        
}
	 static String[] a = {"zero","one","two","three","four",
	 			"five","six","seven","eight","nine",
	 			"ten","eleven","twelve","thirteen",
	 			"fourteen","fifteen","sixteen","seventeen",
	 			"eighteen","nineteen"};
	 	static String[] b = {"twenty","thirty","forty","fifty",
	 			"sixty","seventy","eighty","ninety"};
	 	static String[] d = {"thousand","million","billion"};
	 	static String[] e = {"one","ten","hundred"};
	 	
	 	static int s, t;
	 	static int x = 0;
	 	static int y;
	 	static String c = "";
	 	static String p = "";
	static String hunToone(int m, int n){
		
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
	 	
        return a[m];
	}

	 static String translateEng(int n) {
		 	int m = n;
	 	int l = n;
	 	String sm = "";
	 	String ss= "";
	 	String sn = String.valueOf(n);
	 	if(sn.length()%3==1){
	 		sm = sn.substring(0,1);
	 	};
	 	if(sn.length()%3==2){
	 		sm = sn.substring(0,2);
	 	};
	 	if(sn.length()%3==0){
	 		sm = sn.substring(0,3);
	 	};
	 	m = Integer.parseInt(sm);
	 	ss = hunToone(m,n) + " thousands";
	 	
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
		 	return ss;
	 }
}
