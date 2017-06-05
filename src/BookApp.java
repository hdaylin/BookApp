import java.util.Scanner;

public class BookApp{

	public static void main(String[] args) {
		
		String inputtitle;  
		int amount = 0; 

		Scanner keyboard = new Scanner(System.in);
		
		Book a = new Book("Kite Runner", "Harper Lee", "Great!", 20.00, 35); 
	
			
		System.out.println("What book do you want? (Kite Runner)"); 
		inputtitle = keyboard.nextLine(); 
		
		determinePrice(inputtitle, a.getTitle(), amount, a.getInstock(),  a.getPrice(), keyboard);
		
	}
		
		public static void determinePrice(String inputtitle, String storedTitle, int amount, int instock,  double price,  Scanner keyboard){ 
			
			if(inputtitle.equals(storedTitle)){ 
				System.out.println("How many do you want?"); 
				amount = keyboard.nextInt(); 
				
				while(amount>instock){
					System.out.println("Sorry we only have "+ instock+ " in stock."); 
					System.out.println("How many do you want?"); 
					amount = keyboard.nextInt(); 
				}
				
				System.out.println("That will cost you: " + amount * price);
				
				
			}else if(inputtitle.equals(storedTitle)){ 
				System.out.println("How many do you want?"); 
				amount = keyboard.nextInt();   
				
				while(amount>instock){
					System.out.println("Sorry we only have "+ instock+ " in stock."); 
					System.out.println("How many do you want?"); 
					amount = keyboard.nextInt(); 
				}
				
				System.out.println("That will cost you: " + amount * price);
			
			}else{
				System.out.println("Sorry, we don't have that book.");
			} 
			
			
		}		
		
		
	} 
	
	
	

