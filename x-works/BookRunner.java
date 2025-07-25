class BookRunner
{
public static void main(String[] args)
{
Book book = new Book();                                             
System.out.print(book.getTitle());
book.setTitle("classmate");
System.out.println(book.getTitle());

Book book2 = new Book();
System.out.println(book2.getPrice());
book2.setPrice(200);
System.out.println(book2.getPrice());

Book book3 = new Book();
System.out.println(book3.getQuantity());
book3.setQuantity(2);
System.out.println(book3.getQuantity());

Book book4 = new Book();
System.out.println(book4.getAuthor());
book4.setAuthor("rama");
System.out.println(book4.getAuthor());

Book book5 = new Book();
System.out.println(book5.getTitle());
book4.setTitle("choudary");
System.out.println(book5.getTitle());

Book book6 = new Book();
System.out.println(book6.getPrice());
book6.setPrice(100);
System.out.println(book6.getPrice());

Book book7 = new Book();
System.out.println(book7.getQuantity());
book7.setQuantity(5);
System.out.println(book7.getQuantity());

Book book8 = new Book();
System.out.println(book8.getAuthor());
book8.setAuthor("thanmai");
System.out.println(book8.getAuthor());

String details = book.bookDetails();
System.out.println(details);
}
}