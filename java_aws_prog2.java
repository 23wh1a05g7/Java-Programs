package java_awt_project;
import java.awt.*;
class prog1{
	prog1(){
		Frame f = new Frame();
		Button b = new Button("Click me!");
		b.setBounds(30,50,80,30);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		prog1 f = new prog1();
	}
}
