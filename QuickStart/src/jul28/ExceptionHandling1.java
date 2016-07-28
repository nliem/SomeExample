package jul28;

import java.io.IOException;

public class ExceptionHandling1 {
	
	public String understandFinally(){
		String number = "Four";
		
		int val = Integer.parseInt(number);
		
		return null;
	}
	
	public static void main(String[] args){
		String s = "HI";
		
		try{
			System.out.println("String length is " + s.length());
		}
		catch(NullPointerException e){
			System.err.println("String Value is Null - Check");
			System.err.println(e.getMessage());
		}
		finally{
			System.out.println("Finallyyyyy");
		}
		System.out.println("BYE");
	}
	
	public String whatever() throws IOException{
		throw new IOException("This is an exception");
	}

}
