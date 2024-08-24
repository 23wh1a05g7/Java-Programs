public class methodOverloading {
    public static int Sum(int x) {
        return (x + x);
    }

    public static int Sum(int x, int y) {
        return (x + y);
    }

    public static double Sum(double x, double y) {
        return (x + y);
    }

    public static void main(String[] args) {
        methodOverloading a = new methodOverloading();

        System.out.println("single parameter: " + a.Sum(8));
        System.out.println("multiple parameters: " + a.Sum(15, 25));
        System.out.println("other datatype parameters: " + a.Sum(3.7, 4.2));
    }
}
