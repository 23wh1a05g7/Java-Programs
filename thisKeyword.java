public class thisKeyword {
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
		thisKeyword obj = new thisKeyword();
		obj.display();
	}
}
