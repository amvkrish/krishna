package demo;

public class Outer {
	
	private int i;
	
	public void function() {
		System.out.println("outer class" +i);
	}
	
	class inner {
		float f;
		public void function() {
			System.out.println("inner class" +(f+i));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer ();
		o.i = 5;
		o.function();
		
		
		
		
	}

}
