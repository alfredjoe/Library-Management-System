package College;

import java.util.Scanner;
public class book{
public int sNo;
public String bookName;
public String authorname;
public int bookQtyCopy;

   Scanner input = new Scanner(System.in);
 public book(){
	System.out.println("enter serial no of book:");
	this.sNo =input.nextInt();
	input.nextLine();
	System.out.println("enter book name");
	this.bookName =input.nextInt();
	System.out.println("enter Author name");
	this.bookName =input.nextInt();
	System.out.println("Enter Quantity of Books:");
        this.bookQty = input.nextInt();
        bookQtyCopy = this.bookQty;
        }
}
