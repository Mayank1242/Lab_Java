package unit_01;

public class P5_Task02_Methods_in_java {
	public static void main(String[] args)
    {
        ABC3 obj=new ABC3();

        //calling display method definition
        obj.display();
        System.out.println(obj.a);
    }
}
class ABC3{
    static int a=10;
    /*Actual method definition
     * DataType methodName(DataType1 p1,DataType2 p2){
     *
     * methodBody
     * return value; //if required
     * }
     */
    static void display()
    {
        int b=10;
        int a=10;
        System.out.println(b);

    }
    int display2() {
        System.out.println(a);
        //As a was a local variable so we cannot access it outside the method
//		System.out.println(b);

        return a;
    }
	
}
