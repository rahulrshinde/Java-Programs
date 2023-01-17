package objectarray;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		
		int BookId, count=0;
		String BookName;
		String AuthorName;
		int Prize;
		int opertion;
		Scanner sc = new Scanner(System.in);
		Book book[] = new Book[10];
		while(true) {
			System.out.println("1.ADD BOOK: ");
			System.out.println("2.UPDATE BOOK: ");
			System.out.println("3.DELETE BOOK: ");
			System.out.println("4.SEARCH BOOK: ");
			System.out.println("5.GET ALL BOOK: ");
			System.out.println("6.EXIT");
			System.out.println(" ");
			System.out.println("Enter the choice: ");
			opertion=sc.nextInt();
			switch(opertion) {
			case 1:
				System.out.println(" ADD BOOK");
				System.out.println("Enter number of Book: ");
				int a=sc.nextInt();
				for (int i=0;i<a;i++) {
					System.out.println("Enter the BookId: ");
					BookId=sc.nextInt();
					System.out.println("Enter the BookName: ");
					BookName=sc.next();
					System.out.println("Enter the AuthorName: ");
					AuthorName=sc.next();
					System.out.println("Enter the Prize: ");
					Prize=sc.nextInt();
					book[count]= new Book(BookId,BookName,AuthorName,Prize);
					count++;
				}
				System.out.println("Add Book Successfully!");
				break;
				
			case 2:
				System.out.println(" UPDATE BOOK");
				System.out.println("Enter the BookId for update: ");
				BookId=sc.nextInt();
				for (int i=0;i<count;i++) {
					if (book[i]!=null && book[i].getBookId()==BookId) {
						System.out.println("Enter the Book Name for Update: ");
						BookName=sc.next();
						book[i].setBookName(BookName);
						System.out.println("Enter the Book Author Name for Update: ");
						AuthorName=sc.next();
						book[i].setAuthorName(AuthorName);
						System.out.println("Enter the Book Prize for Update: ");
						Prize=sc.nextInt();
						book[i].setPrize(Prize);
					}
				}
				System.out.println("Book Update Successfull!");
				break;
				
			case 3:
				System.out.println(" DELETE BOOK");
				System.out.println("Enter the BookId for Delete: ");
				BookId=sc.nextInt();
				for(int i=0;i<count;i++) {
					if(book[i]!=null && book[i].getBookId()==BookId) {
						book[i]=null;
					}
				}
				System.out.println("Delete Book Successfully!");
				break;
				
			case 4:
				System.out.println(" SEARCH BOOK");
				System.out.println("Enter the bookId for Search: ");
				BookId=sc.nextInt();
				for(int i=0;i<count;i++) {
					if(book[i]!=null && book[i].getBookId()==BookId) {
						System.out.println(book[i]);
					}
				}
				System.out.println("Search Book Successfully!");
				break;
				
			case 5:
				System.out.println(" ALL INFO BOOK ");
				System.out.println("All Book are: ");
				for(int i=0;i<count;i++) {
					System.out.println(book[i]);
				}
				System.out.println("All Book are: ");
				break;
				
			case 6:
				System.exit(0);
				break;
				default:
					System.out.println("Enter right choice: ");
			}
		}

	}

}
