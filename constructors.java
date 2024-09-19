public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person p = new Person("John");
        p.display();
    }
}
