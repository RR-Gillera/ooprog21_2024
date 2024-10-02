public class MathTest {

    public static void print(String statement) {
        System.out.println("\t" + statement);
    }

    public static void main(String[] args) {

        double a = 18.7, b = 54;

        print("SQRT: " + Math.sqrt(a));
        print("SIN: " + Math.sin(a));
        print("COS: " + Math.cos(a));
        print("FLOOR: " + Math.floor(a));
        print("CEIL: " + Math.ceil(a));
        print("ROUND: " + Math.round(a));
        print("MAX: " + Math.max(a, b));
        print("MIN: " + Math.min(a, b));
        print("POW: " + Math.pow(a, b));
        print("RANDOM: " + Math.random());

    }
}
