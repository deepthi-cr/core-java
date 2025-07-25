class BooksRunner
{
public static void main(String[] args){
Books book = new Books();
System.out.println(book.getTitle());
book.setTitle("Harry Potter");
System.out.println(book.getTitle());

String details = book.bookDetails();
System.out.println(details);
}
}