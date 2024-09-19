public class Example {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1 = null;  
        obj2 = null;  

        System.gc();  

        System.out.println("End of program");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected");
    }
}
