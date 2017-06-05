import java.util.Scanner;

public class Book {

	private String title; 
	private String author; 
	private String decription; 
	private double price; 
	private int instock;
	
	// this is the default constructor 
	public Book(){
		
	}
	
	// this is the overloaded constructor 
	public Book(String title, String author, String description, double price, int instock){
		this.title = title; 
		this.author = author; 
		this.decription = description; 
		this.price = price;
		this.instock = instock;
		
		
	}  
	
	
		 
//	}
	
	
	public String getDisplayText() {
		return "Title: " + title + " Author: " + author +" Description:  " + decription + " price: " + price; 
	}
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInstock() {
		return instock;
	}
	public void setInstock(int instock) {
		this.instock = instock;
	} 
	
	
	
	
	
}
