package jul28;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookGC {
	
	public static void main(String[] args){
		Book b;
		try {
			b = new Book(101, "H", "C", 52.20);
			System.out.println(b);
			b = null;
			
			System.gc();
			
			System.out.println("Look at the console for a special message...");
			System.out.println("KEEP RUNNINNNNGNGGGG");
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void myExample() throws ParseException, IOException{
		new SimpleDateFormat("yyyMMdd").parse("date");
		new FileReader("Abc.txt").read();
	}
}
