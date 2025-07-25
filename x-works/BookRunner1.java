class BookRunner1
{
public static void main(String[] args){
Book book = new Book();
System.out.println(book.getTitle());
book.setTitle("Harry Potter");
System.out.println(book.getTitle());

String details = book.bookDetails();
System.out.println(details);
}
}