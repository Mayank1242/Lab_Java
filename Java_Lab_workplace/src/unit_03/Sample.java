package unit_03;

import java.io.*;
import java.util.InputMismatchException;

public class Sample {
public static void main(String args[]) {
	
	//Finally always runs because-:
	//if there is no exception still finally will be run ad still there is exception finally will run.
	//if there is a exception in try block but there is no approciate catch block still finally will run;
	try {
		int a=100/0;
		System.out.println(a);
	} catch (InputMismatchException e) {
		System.out.println(e.getMessage()); }
//	}catch(Exception e) {
//		System.out.println(e);
//	}
	finally {
	System.out.println("Done!!!!");
	}
}
}
