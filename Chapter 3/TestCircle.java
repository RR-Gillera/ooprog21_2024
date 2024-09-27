public class TestCircle {
    
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        a.setRadius(3);

        System.out.println("\n\t\tRadius of circle a: " + a.getRadius());
        System.out.println("\t\tDiameter of circle a: " + a.getDiameter());
        System.out.println("\t\tArea of circle a: " + a.getArea());

        b.setRadius(20);

        System.out.println("\n\t\tRadius of circle b: " + b.getRadius());
        System.out.println("\t\tDiameter of circle b: " + b.getDiameter());
        System.out.println("\t\tArea of circle b: " + b.getArea());

        c.setRadius(15);

        System.out.println("\n\t\tRadius of circle c: " + c.getRadius());
        System.out.println("\t\tDiameter of circle c: " + c.getDiameter());
        System.out.println("\t\tArea of circle c: " + c.getArea());

    }
}
