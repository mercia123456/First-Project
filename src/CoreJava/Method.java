package CoreJava;

public class Method {
	
	static int age = 9;
	int model = 2016;
	
	public static void main(String[]args) {
		Method obj = new Method();//creation of object)
		obj.test();
	
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30,10);
		System.out.println(div);
		
		//static methods to be called
		
			Method.sum();
			System.out.println(age);
			
			System.out.println(obj.model);//non static
			
		}
	private static void sum() {
		
		
	}
	
	//Non -static methods
	
	public void test() {//no parameters
		System.out.println("Test Method");}
		
		public int pqr() {
			System.out.println("PQR Method");
			int a = 10;
			int b = 20;
			int c = a+b;
			return c;}
		
		public String qa() {
			System.out.println("QA Method");
			String s= "Selenium";
			return s;
			
		}
		public int division(int x, int y) {
			System.out.println("Division Method");
			int d =x/y;
			return d;
		}
		
	}


