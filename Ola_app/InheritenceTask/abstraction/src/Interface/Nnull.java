package Interface;

public class Nnull {
	
		void a1(){
			
			System.out.println("hello");
			}
		public static void main(String[]args){
			Nnull a=null;
			
			try {
			a.a1();
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
			System.out.println("hello");
		}
			
		}
		
	
		
		
		



