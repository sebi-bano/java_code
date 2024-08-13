package Upcasting;

public class A {
	void parent() {
        System.out.println("hello parent");
    }
	

}
class B extends A{
	void child() {
		System.out.println("hello child");
	}
	
}

class call {
    public static void main(String[] args) {
       
       A a=new B();
       a.parent();
        
        
    }
}