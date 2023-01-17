package Bookminiproject;

public class Book {
	
	private int BookId, Prize;
	private String Name, Author;
	
	public int getBookId() {
		return BookId;
	}
	
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public void setAuthor(String author) {
		Author = author;
	}
	
	public int getPrize() {
		return Prize;
	}
	
	public void setPrize(int prize) {
		Prize = prize;
	}
	
	Book(int BookId,String Name, String Author, int Prize){
		this.BookId=BookId;
		this.Name=Name;
		this.Author=Author;
		this.Prize=Prize;
	}
	
	public void display() {
		
		System.out.println("Book Id : "+BookId);
		System.out.println("Book Name : "+Name);
		System.out.println("Author Name : "+Author);
		System.out.println("Book Prize : "+Prize);
	
	}

}
