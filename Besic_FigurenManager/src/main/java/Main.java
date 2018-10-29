public class Main {

    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rect = new Rectangle(2, 3);
        Circle circle = new Circle(3);
        Ellipse ellipse = new Ellipse(3, 2);

        System.out.println(square.output());
        System.out.println(rect.output());
        System.out.println(circle.output());
        System.out.println(ellipse.output());

    }



}
