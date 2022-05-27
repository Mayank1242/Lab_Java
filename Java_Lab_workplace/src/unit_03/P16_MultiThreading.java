package unit_03;

import java.util.Scanner;



//1-multiprocessing---------
//type -3
//sequenital multiprocessing
//parellel   multiprocessing
//concurral

//2-multitasking-----------
//Type-2
////sequenital multitsking
//parellel    (not avaliable).
//concurral

class a extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println(a);
	}
}
class b extends Thread{
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("hey2");
		}
	}
}
class c extends Thread{
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("hey3");
		}
	}
}
class MUltithread{
	public void threadconcept() {
		
	}
public void threadSyncronization() {
		
	}
public void interThreadCommunication() {
	
}
public void ProducerConsumerProblem() {
	
}
public void Wait_And_Notify() {
	
}

}

public class P16_MultiThreading {
public static void main(String agrs[]) {
	MUltithread obj=new MUltithread();
	obj.threadconcept();
	obj.threadSyncronization();
	obj.interThreadCommunication();
	obj.ProducerConsumerProblem();
	obj.Wait_And_Notify();
	System.out.println("a");
	
//	c1 obj1=new  c1();
//	obj1.start();
//	
//	c2 obj2=new c2();
//	obj2.start();
	Thread a=new Thread(new a(),"t1");
	Thread b=new Thread(new b(),"t2");
	Thread c=new Thread(new c(),"t3");

	a.start();
	b.start();
	c.start();
}
}
