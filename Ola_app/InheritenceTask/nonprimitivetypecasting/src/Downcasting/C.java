package Downcasting;

public class C {
	void parent() {
        System.out.println("hii parent");
    }

	
}

class D extends C{
	void child() {
		 System.out.println("hii child");
		
	}
}

class call{
	public static void main(String[]args) {
		C c=new C();
		D d=(D)c;
		
		d.parent();
		
		 
	}
} 