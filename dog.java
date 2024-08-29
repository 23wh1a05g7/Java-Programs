package yuvika;

public class dog {
	String name;
	String colour;
	public dog(String a, String b) {
	name = a;
	colour = b;
	}
	
	public static void main(String[] args) {
		dog myObj = new dog("Hello","Alex");
		System.out.println(myObj.name);
		System.out.println(myObj.colour);
	}
} 