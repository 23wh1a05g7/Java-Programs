package yuvika;

class outerClass{
	class processor{
		void displayDetails() {
			System.out.println("Brand = "+"Lenova");
			System.out.println("Speed = "+"200 Mpx");
		}
	}
}
public class computer {

	public static void main(String[] args) {
		outerClass myObj1 = new outerClass();
		outerClass.processor myObj2 = myObj1.new processor();
		myObj2.displayDetails();
	}
}