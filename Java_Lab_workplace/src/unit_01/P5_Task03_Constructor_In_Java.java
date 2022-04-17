/*It is called when an instance of the class is created
 * -At the time of calling the constructor ,memory for the object is allocated in the memory
 * -It is special type of method which is used to initialize the object
 * -Every time an object is created using new() nkeyword ,at least one constructor is called
 * -Two types of constructor in java
 *  -Parameterized constructor.
 *  Default constructor.
 * */
package unit_01;

public class P5_Task03_Constructor_In_Java {
    public static void main(String[] args) {
        ABC4 obj= new ABC4();
        ABC4 obj1=new ABC4(1);
        System.out.println(obj.a);

    }

}
class ABC4{
    int a;
    /*ClassName (constructor parameters)
     * All the class and Instance variables can be initialized here!
     */
    ABC4(){
        a=10;
    }
    ABC4(int a){
        this.a=a;
    }
    void display()
    {
        int b=10;
        System.out.println(a);
        System.out.println(b);
    }
    int display2() {
        System.out.println(a);
        return a;
    }
}
