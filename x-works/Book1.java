class Book1 
{
String title;
int pages;
double price;
String genre;
String author;
public Book (){
}

public static void main(String[] args){

Book book = new Book();
book.name = "Samsung";
System.out.println("Tv Name is : " + tv.name);

Book  book1 = new Book();
book.size = 32;
System.out.println("Tv Size is :" + book.size);

Book book2 =new Book();
book2.price = 2000.2;
System.out.println("Tv Price is : " +book2.price);

Book book3 = new Book();
tv3.smart = true;
System.out.println("The TV is smart : " + tv3.smart);

Tv tv4 = new Tv();
tv4.color= "silver";
System.out.println("Tv color is :" + tv4.color);

tv.setName("LG");
System.out.println("Tv Name is : " + tv.name);

tv1.setSize(34);
System.out.println("Tv Size is :" +tv1.size);

tv2.setPrice (2000.45);
System.out.println("Tv Price is: " + tv2.price);

tv3.setSmart(true);
System.out.println("the tv is smart :" + tv3.smart);

tv4.setColor("Black");
System.out.println("Tv color is: " + tv4.color);

}

public void setName(String tvName){
name = tvName;

}

public void setSize(int tvSize){
size = tvSize;
}

public void setPrice(double tvPrice){
price= tvPrice;
}

public void setSmart(boolean tvSmart){
smart = tvSmart;
}

public void setColor(String tvColor){
color = tvColor;
}
}