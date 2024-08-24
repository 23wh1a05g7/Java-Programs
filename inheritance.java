class inheritance{
	public static void main(String[] args) {
		Sub obj = new Sub();
		System.out.println("Name: "+obj.a+", Age: "+obj.b);
	}
}
class Test {
	String a="Yuvika";
}
class Sub extends Test{
	int b = 19;
}
