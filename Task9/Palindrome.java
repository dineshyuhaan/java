package practice;

public class Palindrome {

	public static void main(String[] args) {
		
String s="yuhaan";

int j=0;

for(int i=0; i<s.length()/2; i++) {
	
	char start = s.charAt(i);
	char end= s.charAt (s.length()-1 -i);
	if(start!=end) {
		j=1;
		break;
	}
}
if(j ==0) {
	System.out.println("palindrome");
}
else {
	System.out.println("not a palindrome");
	
}
	}

}
