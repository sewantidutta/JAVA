public class wrapperclass {
    public static void main(String[] args) {
        // unboxing
        Double a = 10.0;
        double x = a;
        System.out.println("unboxed value " + x);
        // doing unboxing implicitly
        Double g = 50.0;
        double h = g.doubleValue();
        System.out.println("implicitly unboxed value " + h);
        // autboxed
        int c = 20;
        Integer b = c;
        System.out.println("autoboxed value " + b);
        // doing autoboxing implicitly
        double m = 56;
        Double n = Double.valueOf(m);
        System.out.println("implicitly autoboxed value " + n);
    }
}
