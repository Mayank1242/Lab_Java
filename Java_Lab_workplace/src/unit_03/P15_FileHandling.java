package unit_03;
import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
class Filehandling{
	
	static int a=10;
public void take_Input_From_A_File_Not_From_Console() throws IOException{
	String path = "C:\\Users\\DELL\\git\\Java_Lab_Workplace\\Java_Lab_workplace\\src\\unit_03\\input.txt";
	File file = new File(path);

	BufferedReader br = new BufferedReader(new FileReader(file));
//
//	String st;
//	while ((st = br.readLine()) != null) {
//		System.out.println(st);
//	}

	// list that holds strings of a file
	List<String> listOfStrings = new ArrayList<String>();
    
	// read entire line as string
	String line = br.readLine();

	while (line != null) {
		listOfStrings.add(line);
		line = br.readLine();
	}

	for (String str : listOfStrings) {
		System.out.println(str);
	}
	System.out.println("\n");
	br.close();
}

public void save_Output_Into_A_File()   throws IOException{
	FileWriter myObj = null;

	try {
		myObj = new FileWriter("C:\\Users\\DELL\\git\\Java_Lab_Workplace\\Java_Lab_workplace\\src\\unit_03\\output.txt",false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	BufferedWriter f_writer = new BufferedWriter(myObj);

	String text = "Hey this would store in Output file";

	f_writer.write(text);
	f_writer.close();

}
public void create_A_Log_File() throws IOException {
	a++;
	
	//Find current time and Date
	LocalTime ltime = java.time.LocalTime.now();
	LocalDate ldate = java.time.LocalDate.now();
	
	FileWriter myObj = null;

	try {
		 myObj = new FileWriter("C:\\Users\\DELL\\git\\Java_Lab_Workplace\\Java_Lab_workplace\\src\\unit_03\\log.txt",true);
	} catch (IOException e) {
		e.printStackTrace();
	}

	BufferedWriter f_writer = new BufferedWriter(myObj);

	String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

	try {
		f_writer.write("Value of a: " + a + ", ");
		f_writer.write(text);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	f_writer.close();


}

}
public class P15_FileHandling {
	public static void main(String args[]) throws IOException{
		Filehandling obj=new Filehandling();
        
         obj.take_Input_From_A_File_Not_From_Console();
//         obj.save_Output_Into_A_File();
//         obj.create_A_Log_File();
	}

}
