class Book{
  String title;
  String author;
  int price;

  void book_details(){
    System.out.println("title:" + title);
    System.out.println("author:" + author);
    System.out.print("price:" + price);
  }
}

public class Handle_Book_Details {
  public static void main(String[] args) {
      Book b1 =  new Book();
      b1.author = "Amit";
      b1.title = "XYZ";
      b1.price = 800;
      b1.book_details();
  }
}
