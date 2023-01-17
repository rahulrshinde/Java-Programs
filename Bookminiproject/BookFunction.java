package Bookminiproject;

import java.util.Scanner;

public class BookFunction {
	
	int BookId, Prize, count=0;
	String Name, Author;
	
	Book book[] = new Book[20];
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("1.Add Book: ");
		System.out.println("2.Update Book: ");
		System.out.println("3.Delete Book: ");
		System.out.println("4.Search Book: ");
		System.out.println("5.Get All Book: ");
		System.out.println("6.Exit");
		System.out.println("Enter the Choice: ");
	}

	// Add Book
	public void add() {
		System.out.println("Enter the Book Id: ");
		BookId=sc.nextInt();
		System.out.println("Enter the Book Name: ");
		Name=sc.next();
		System.out.println("Enter the Author Name: ");
		Author=sc.next();
		System.out.println("Enter the Prize: ");
		Prize=sc.nextInt();
		book[count]= new Book(BookId,Name,Author,Prize);
		count++;
		System.out.println("Add Book Successfully");
		System.out.println("****************************");
	}

	// Update Book
	public void update(){
		boolean bookfound = false;

		System.out.println("Enter Book Id: ");
		int up = sc.nextInt();
		for(int i=0; i<count; i++){
			if(book[i] != null && book[i].getBookId() == up){
				System.out.println("Enter Book Name for Update: ");
				Name = sc.next();
				book[i].setName(Name);

				System.out.println("Enter Author Name for Update: ");
				Author = sc.next();
				book[i].setAuthor(Author);

				System.out.println("Enter Prize for Update: ");
				Prize = sc.nextInt();
				book[i].setPrize(Prize);
				bookfound = true;
			}
		}

		if(bookfound == true){
			System.out.println("Book Update Successfully!");
			System.out.println("****************************");
		}
		else {
			System.out.println("Enter Correct Book Id: ");
			update();
		}
	}

	// Delete Book
	public void delete(){
		boolean bookfound = false;

		System.out.println("Enter Book Id for Delete:  ");
		int del = sc.nextInt();
		for(int i=0;i<count;i++){
			if(book[i] != null && book[i].getBookId()==del){
				book[i] = null;
				bookfound = true;
			}
		}
		if(bookfound == true){
			System.out.println("Book Delete Successfully!");
			System.out.println("****************************");
		}
		else {
			System.out.println("Enter Correct Book Id: ");
			delete();
		}
	}

	// Search Book
	public void search(){
		boolean bookfound = false;

		System.out.println("Enter Book Id for Search: ");
		int ser =sc.nextInt();
		for(int i=0;i<count;i++){
			if(book[i] != null && book[i].getBookId()==ser){
				book[i].display();
				bookfound = true;
			}
		}
		if(bookfound == true){
			System.out.println("Book Search Successfully!");
			System.out.println("****************************");
		}
		else {
			System.out.println("Enter Correct Book Id: ");
			search();
		}
	}

	// Show all method:
	public void Getallbooks(){
		for (int i=0; i<count; i++){
			if (book[i] != null) {
				book[i].display();
				System.out.println("****************************");
			}
		}
	}

}


