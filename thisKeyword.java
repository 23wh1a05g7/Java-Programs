public class ThisKeyword {
	String name;
	int age;
	void display() {
		this.info();
		System.out.println("Name: "+name+", Age: "+age);
	}
	void info() {
		name="Yuvika";
		age=19;
	}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.display();
	}
}
