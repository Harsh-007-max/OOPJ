/*
Declare a class called book 
having author_name as private data member. 
Extend  book  class  to  have  
two  sub  classes  called  book_publication  & 
paper_publication.  
Each  of  these  classes  have  private  member  called title.  
Write  a  complete  program  to  show  usage  of  dynamic  method dispatch 
(dynamic polymorphism) to display book or paper publications 
of given author.Use command line arguments for inputting data.
 */
class Book{
    private String author_name;
    Book(String name){
        author_name = name;
    }
    Book(){}

    public void print(){
        System.out.println("author of book is: "+author_name);
    }
}
class Book_publication extends Book{
    private String title;
    Book_publication(String t){
        title = t;
    }
    public void print(){
        System.out.println("title of book is: "+title);
    }
}
class Paper_publication extends Book{
    private String title;
    Paper_publication(String t){
        title = t;
    }
    public void print(){
        System.out.println("title of book is: "+title);
    }
}
public class prog2 {
    public static void main(String[] args) {
        Book b = new Book(args[0]);
        b.print();
        b = new Book_publication(args[1]);
        b.print();
        b = new Paper_publication(args[2]);
        b.print();
    }
}
