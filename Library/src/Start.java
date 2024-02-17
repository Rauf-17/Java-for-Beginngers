import java.lang.*;

public class Start
{
  public static void main (String [] args)
  { 
  	StoryBook s1 = new StoryBook();
        
        StoryBook.setDiscountRate(8);
        
        s1.setIsbn("7364737237");
        s1.setBookTitle("Dipu Number Two");
        s1.setAuthorName("Muhammad Jafor Iqbal");
        s1.setPrice(300);
        s1.setAvailableQuantity(37);
        s1.setCategory("Adventure");
        
        s1.addQuantity(3);
        s1.sellQuantity(1);
        
        System.out.println("First Story Book : ");
        System.out.println("Isbn : " + s1.getIsbn());
        System.out.println("Book Title : " + s1.getBookTitle());
        System.out.println("Author Name : " + s1.getAuthorName());
        System.out.println("Price : " + s1.getPrice());
        System.out.println("Discount Rate : " + StoryBook.getDiscountRate());
        System.out.println("Available Quantity : " + s1.getAvailableQuantity());
        System.out.println("Category : " + s1.getCategory());
        
        System.out.println("--------------------------------------------");
        
        
        
        
        StoryBook s2 = new StoryBook("6326631256","A Song of Ice and Fire","JJ Martin",3000,11,"Mysterious");
        
        StoryBook.setDiscountRate(25);
        
        s2.addQuantity(6);
        s2.sellQuantity(2);
    
        System.out.println("Story Book : ");
        s2.showDetails();
        System.out.println("--------------------------------------------");


         TextBook t1 = new TextBook();
        
        TextBook.setDiscountRate(10);
        
        t1.setIsbn("68435346863");
        t1.setBookTitle("English For Today");
        t1.setAuthorName("Ami Jani Nah");
        t1.setPrice(10);
        t1.setAvailableQuantity(80);
        t1.setCategory("Learning");
        
        s1.addQuantity(56);
        s1.sellQuantity(20);
        
        
        System.out.println("First Text Book : ");
        System.out.println("Isbn : " + t1.getIsbn());
        System.out.println("Book Title : " + t1.getBookTitle());
        System.out.println("Author Name : " + t1.getAuthorName());
        System.out.println("Price : " + t1.getPrice());
        System.out.println("Discount Rate : " + TextBook.getDiscountRate());
        System.out.println("Available Quantity : " + t1.getAvailableQuantity());
        System.out.println("Standard : " + t1.getCategory());
        System.out.println("--------------------------------------------");
        
        
        
        TextBook t2 = new TextBook("1234342131","Bangla 1st Paper","Jack and Johns",150,44,"Learning");

        TextBook.setDiscountRate(5);

        t2.addQuantity(10);
        t2.sellQuantity(27);

        System.out.println("Text Book 2: ");
        t2.showDetails();
        System.out.println("--------------------------------------------");
    }
  }
  

