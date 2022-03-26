package unit_01;



//public class void{   //Can't make class as keyword
//	System.out.println("it cant work");
//
//
//}

public class P1_task2_lab {
	
	
	static int a=10;   //Static function only give access to  global static function.
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


//public static void int(String args[]) {   //Also can't make a function name as keyword
//		System.out.println("hloo");    
//
//
//
//}	



}
