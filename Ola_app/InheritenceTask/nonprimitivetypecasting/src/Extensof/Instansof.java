package Extensof;

public class Instansof {
	void parent() {
        System.out.println("hello");
    }
	

}
class child extends Instansof{
	void child1() {
		System.out.println("hii");
	}
	
}

class call{
	public static void main(String[]args) {
		Instansof a=new child();
		if(a instanceof child) {
			child c=(child) a;
			
			
		}
	}
}
