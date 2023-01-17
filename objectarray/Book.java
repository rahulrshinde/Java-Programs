package objectarray;

public class Book {
	
	private int BookId;
	private String BookName;
	private String AuthorName;
	private int Prize;
	
	public int getBookId() {
		return BookId;
	}
	
	public void setBookID(int bookId) {
		BookId = bookId;
	}
	
	public String getBookName() {
		return BookName;
	}
	
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
	public String getAuthorName() {
		return AuthorName;
	}
	
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	
	public int getPrize() {
		return Prize;
	}
	
	public void setPrize(int prize) {
		Prize = prize;
	}
	
	Book (int BookId,String BookName,String AuthorName,int Prize) {
		this.BookId=BookId;
		this.BookName=BookName;
		this.AuthorName=AuthorName;
		this.Prize=Prize;
	}
	
	@Override
	public String toString() {
		return "Book [BookId = " + BookId + ", BookName = " + BookName + ", AuthorName = " + AuthorName + ", Prize = " + Prize + "]";
	}

}
