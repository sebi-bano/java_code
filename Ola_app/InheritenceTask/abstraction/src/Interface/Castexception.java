package Interface;

public class Castexception {
	void Child1() {
		System.out.println("hello");
	}

}


class Child extends Castexception{
	void child1() {
		System.out.println("java");
	}
}

class call{
	public static void main(String[]args) {
		Castexception c=new Castexception();
		Child d=(Child) c;
		d.child1();
		
	}
}