package muntu4;
public class remaindRSap {
	public static void main(String[] args) 	{ 
int endx =5; 
System.out.println("============ SAP1 =========================");
for (int i=1; i<endx; i++){
if(i%3==0) {System.out.println("fizz");}
if(i%5==0) {System.out.println("buzz");}
else{ System.out.println(i);}}
System.out.println("=============== SAP2 ======================");
String pemba="ZZZZZ";
int z=pemba.length();
for(int i=1;i<z;i++){
	if(pemba.charAt(i)==pemba.charAt(z-i)){System.out.println("TRUE");}
	else	{System.out.println("FALSE");}}
System.out.println("=============== VIEW3 ======================");
} 
} 