package Castexception;

public class E {
	void parent() {
        System.out.println("hello parent");
    }

}
class F extends E{
	void child() {
		 System.out.println("hii child");
		
	}
}

class call{
	public static void main(String[]args) {
		E e=new E();
		F f=(F) e;
		
		f.parent();
		
		 
	}
} 