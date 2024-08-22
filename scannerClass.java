package yuvika;
import java.util.Scanner;
public class scannerClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = input.nextLine();
		
		System.out.println("Enter ID: ");
		String rollno = input.nextLine();
		
		System.out.println("Enter Branch: ");
		String branch = input.nextLine();
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+rollno);
		System.out.println("Branch: "+branch);
		System.out.println("Number: "+number);
	}
}