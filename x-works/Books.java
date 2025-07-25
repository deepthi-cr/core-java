class Books
{
static String title;
static int pages;
static double price;
static String author;
public Books ()
{
}
public static void main(String[] args)
{
Books book = new Books();
book.title = "Harry potter";
System.out.println(book.title);
book.setTitle("Harry");
System.out.println("Books title is : " + book.title);

Books book1 = new Books();
book1.pages = 234;
System.out.println(book1.pages);
System.out.println("Books1 pages is : " + book1.pages);

Books book2 = new Books();
book2.price = 6000;
System.out.println(book2.price);
System.out.println("Books2 price is : " + book2.price);

Books book3 = new Books();
book3.author = "kuvempu";
System.out.println(book3.author);
System.out.println("Books3 author is : " + book3.author);

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
return "Books Details: " + title + " pages " +  pages + " Author " + author;
}
}
