
public class BookApp{

	public static void main(String[] args) {
		
		
		Book a = new Book(); 
		a.setTitle("To Kill a Mocking Bird"); 
		a.setAuthor("Harper Lee");
		a.setDecription("It was immediately successful,  and has become a classic of modern American literature");
		a.setPrice(20.00);
		a.setInstock(56);
		
		Book b = new Book("Kite Runner", " Khaled Hosseini", "it tells the story of Amir, a young boy from the Wazir Akbar Khan district of Kabul", 15.00, 56);
			
		
		System.out.println(a.getDisplayText());
		System.out.println(b.getDisplayText());
	}

}
