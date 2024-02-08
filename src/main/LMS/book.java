package LMS;

import java.util.Scanner;

public class book {
  // adding our members
  public int sNo;
  public String bookName;
  public String authorName;
  public int bookQty;
  public int bookQtyCopy;

  // Read input from users
  Scanner input = new Scanner(System.in);

  // Book Details
  public book() 
  {
    // user input
    System.out.print("Enter Book Number: ");
    this.sNo = input.nextInt();
    input.nextLine();

    System.out.print("Enter Book Name: ");
    this.bookName = input.nextLine();

    System.out.print("Enter Author Name: ");
    this.authorName = input.nextLine();

    System.out.print("Enter Book Quantity: ");
    this.bookQty = input.nextInt();
    this.bookQtyCopy = this.bookQty;
  }
  
}