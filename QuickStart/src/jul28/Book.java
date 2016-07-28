package jul28;

import java.util.Objects;

public class Book {
	
	private long bookNumber;
	private String bookName;
	private String author;
	private double price;
	
	public Book(long bookNumber, String bookName, String author, double price) throws RangeCheckException{
		if(bookNumber < 1000 || bookNumber > 10000){
			throw new RangeCheckException(bookNumber);
		}
		else{
			this.bookNumber = bookNumber;
		}
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public long getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(long bookNumber){
		if(bookNumber < 1000 || bookNumber > 10000){
			try{
				throw new RangeCheckException(bookNumber);
			}
			catch(RangeCheckException e){
				System.out.println(e.getMessage());
			}
		}
	}
	
	/*
	public void setBookNumber(long bookNumber) throws RangeCheckException {
		if(bookNumber < 1000 || bookNumber > 10000) throw new RangeCheckException(bookNumber);
		this.bookNumber = bookNumber;
	}
	*/
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString(){
		return "Book {Book Number: " + this.bookNumber + "| Book Name: " + this.bookName + 
				"| Author: " + this.author + "| Price: $" + this.price + "}";
	}
	
	@Override
	public boolean equals(Object other){
		if(this == other) return true;
		if(other == null) return false;
		if(this.getClass() != other.getClass()) return false;
		Book otherBook = (Book)other;
		if(this.getBookNumber() != otherBook.getBookNumber()) return false;
		if(!this.getBookName().equals(otherBook.getBookName())) return false;
		if(!this.getAuthor().equals(otherBook.getAuthor())) return false;
		if(this.getPrice() != otherBook.getPrice())return false;
		return true;
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(bookNumber, bookName, price);
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(this + " Object Garbage Collected");
	}
	

}
