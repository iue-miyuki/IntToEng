package kadai5_1;

import java.util.Scanner;

public class IntToEng {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        System.out.println(translateEng(input));	        
}
	 
	 	static String[] d = {"thousand","million","billion"};
	 	static String[] e = {"one","ten","hundred"};
	 	
	 	static int s, t;
	 	static int x = 0;
	 	static int y;
	 	static String c = "";
	 	static String p = "";
	 	
	static String hunToone(int m){
		String[] a = {"zero","one","two","three","four",
	 			"five","six","seven","eight","nine",
	 			"ten","eleven","twelve","thirteen",
	 			"fourteen","fifteen","sixteen","seventeen",
	 			"eighteen","nineteen"};
	 	String[] b = {"twenty","thirty","forty","fifty",
	 			"sixty","seventy","eighty","ninety"};
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
	 	int q;
	 	String sm ="";
	 	String ss= "";
	 	String sn = String.valueOf(n);
	 	String st = "";
	 	int u = sn.length();
	 	int z = u%3;
	 	if(u>6) System.out.println("”‚ª‘å‚«‚·‚¬‚Ü‚·B");
	 	else{
	 	
	 	if(u<4) {
	 		return hunToone(n);
	 	}
	 	if(z==1){
	 		sm = sn.substring(0,z);
	 		st = sn.substring(z);
	 	};
	 	if(z==2){
	 		sm = sn.substring(0,z);
	 		st = sn.substring(z);
	 	};
	 	if(z==0){
	 		sm = sn.substring(0,3);
	 		st = sn.substring(3);
	 	};
	 	
	 	
	 	m = Integer.parseInt(sm);
	 	q = Integer.parseInt(st);
	 	
	 	ss = hunToone(m) + " thousands " ;
	 	if(!hunToone(q).equals("zero")) ss += hunToone(q);
	 	
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
	 	}
		 	return ss;
	 }
}
