import java.util.*;
class book
{
   String name;
   String author;
   float price;
   int pages;
  book()
   { }
   void setdata()
   {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the name of the book: ");
     name=s.nextLine();
     System.out.println("Enter the name of the author: ");
     author=s.nextLine();
     System.out.println("Enter the price of the book: ");
     price=s.nextFloat();
     System.out.println("Enter  the number of pages in the book: ");
     pages=s.nextInt();
   }
 
  public String toString()
   {
     return("\nName: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nPages: "+pages+"\n");
   }
}
class bookmain
{
  public static void main(String args[])
   {
     int i=0;
     int ch;
     Scanner a=new Scanner(System.in);
     System.out.print("Enter number of books: ");
     int n=a.nextInt();
     book b[]=new book[n];
     while(i<n)
       { 
         b[i]=new book(); 
	b[i].setdata();
         System.out.println("Book number: "+(i+1));
         System.out.println(b[i]);
	i++;
         
        }
     }
}



