package Test01;

public class check {
	
	
		private String name = "Fluffy"; 
		{ System. out .println("setting field-01"); } 
		public check() { 
		  name = "Tiny"; 
		System.out.println("setting constructor");
		} 
		{ System. out .println("setting field-02"); }
		
		   public static void main(String[] args) { 
		     check check = new check(); 
		     { System. out .println("setting field-03"); }
		     
		   System.out.println(check.name); }
		   { System. out .println("setting field-04"); }
		   { System. out .println(name); }
		   
}


