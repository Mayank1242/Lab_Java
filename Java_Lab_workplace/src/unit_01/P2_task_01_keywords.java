package unit_01;



//public class void{   //Can't make class name as a keyword
//	System.out.println("it can't work");
//
//
//}

public class P2_task_01_keywords {
	
	
	static int a=10;   //Static function only give access to  global static variables.
	int b=10;
public void newfunction() {

	System.out.println(b);    


		}	

public static  void main(String args[]) {
                 //		int new =10;  //Can't make a variable name as keyword
  
	
	               System.out.println(a);	
  
                  // System.out.println(b); //Without static function we can't access global variable in a static function. 
	
                  //	newfunction(); It will be not work becz it is a non static function
}


//public static void int(String args[]) {   //Also can't make a function name as  keyword
//		System.out.println("hloo");    
//
//
//
//}	



}
