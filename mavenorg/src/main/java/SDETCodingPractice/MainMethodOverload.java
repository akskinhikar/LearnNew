public class MainMethodOverload {

    public static void main(int[] args) {
        System.out.println("int ="+ args );
    }

    public static void main(String[] args) {
        System.out.println("String");
        main(args);
        main(args);
    }

    public static void main(double[] args) {
        System.out.println("Double = "+ args);
    }
}
