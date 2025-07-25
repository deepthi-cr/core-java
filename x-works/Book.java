class Book
{
String title;
int pages;
double price;
String author;
public Book ()
{
}
public static void main(String[] args)
{
Book book = new Book();
book.title = "Harry potter";
System.out.println(book.title);
book.setTitle("Harry");
System.out.println("Book title is : " + book.title);

Book book1 = new Book();
book1.pages = 234;
System.out.println(book1.pages);
System.out.println("Book1 pages is : " + book1.pages);

Book book2 = new Book();
book2.price = 6000;
System.out.println(book2.price);
System.out.println("Book2 price is : " + book2.price);

Book book3 = new Book();
book3.author = "kuvempu";
System.out.println(book3.author);
System.out.println("Book3 author is : " + book3.author);

}
 
public void setTitle(String book)
{
book = book;
}

public String getTitle()
{
return title;
}
public String bookDetails()
{
return "Book Details: " + title + " pages " +  pages + " Author " + author;
}
}
