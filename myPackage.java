package mypackage;

class Message {
    public void showMessage() {
        System.out.println("Hello from the package!");
    }
}

public class Main {
    public static void main(String[] args) {
        Message msg = new Message();
        msg.showMessage();
    }
}
