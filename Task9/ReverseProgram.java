package practice;

public class ReverseProgram {

	public static void main(String[] args) {
 String str="yuhaan";
 char ch;
 String nextS="";
 for (int i=0; i<str.length(); i++)
 {
   ch= str.charAt(i); 
   nextS= ch+nextS; 
 }
 System.out.println("Reversed word: "+ nextS);


}
 
	}


