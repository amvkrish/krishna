package demo;

 public class Datatype {
	
	int i = 5;
	int j = 10000;	//ACCESS MODIFIERS -we mentioned public and here we can use data in this class at anywhere
					// if we remove public(if we denote mention anything it called as a default) word here it will become a default 
					// where we can use default ? -> use as within the package and within the class
					// if we use PRIVATVE  we can't use main method here , and out side the class
					// 
	
	
	public static void main(String[] args) {		//write and achieve accuracy is the programming thing
		// TODO Auto-generated method stub

		Datatype d = new Datatype();
		System.out.print(d.i);
		
		System.out.print(d.i + d.j);

	}
}
