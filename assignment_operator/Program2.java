class Program2{
	public static void main(String [] args){
	int a = 4;
	System.out.println((a>0)? "a is positive" : "a is not positive");


	int a1 = -4;
	System.out.println((a1<0)? "a1 is negative" : "a1 is not negative");


	int b = 2;
	System.out.println((b==0)? "b is zero" : "b is not zero");


	int b1 = 8;
	System.out.println((b1<10)? "b1 is less then 10" :"b1 is not less then 10");


	int b2 = 6;
	System.out.println((b2>=5)? "b2 is greater than or equal to 5" : "b2 is not greater than or equal to 5");


	int c = 9;
	System.out.println((c%3==0)? "c is divisible by 3" : "c is not divisible by 3");



	char ch = 'A';
	String res  = (ch >= 'A' && ch <= 'Z') ? (ch + " is an uppercase letter.") : (ch + " is not an uppercase letter.");
	System.out.println(res);


	char ch1 = 'a';
	String res1  = (ch1 >= 'a' && ch1 <= 'z') ? (ch1 + " is an lowercase letter.") : (ch1 + " is not an lowercase letter.");
	System.out.println(res1);


	char ch2 = 'A';
	String res2  = (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') ? (ch + " is an uppercase vowel") : (ch + " is not an uppercase vowel");
	System.out.println(res2);

}
}