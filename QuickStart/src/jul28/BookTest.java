package jul28;

public class BookTest {
	
	public static void main(String[] args){
		Book b1;

		try {
			b1 = new Book(1, "Game of Thrones", "Geaorge RR Martin", 12.33);
			Book b2 = new Book(2, "Claymore", "Someone", 5.50);
			Book b3 = new Book(2, "Claymore", "Someone", 5.50);
			
			
			System.out.println(b1);
			System.out.println(b2.equals(b3));
			
			Book b4 = null;
			System.out.println(b1.equals(b4));
			
			String s = "potato";
			System.out.println(b1.equals(s));
			
			Book b5 = b1;
			System.out.println(b1.equals(b5));
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
