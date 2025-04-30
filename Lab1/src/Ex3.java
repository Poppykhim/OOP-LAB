
class Shape {

    void star() {
        int rows = 10;

        for (int i = rows; i >= 1; i--) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void rectangle() {
        int height = 15;
        int width = 13;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void matrix() {

        int rows = 5;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < i + cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

public class Ex3 {

    public static void main(String[] args) {

        Shape Shapes = new Shape();

        System.out.printf("%10s\n\n", "A");
        Shapes.star();
        System.out.println();
        System.out.printf("%7s\n\n", "B");
        Shapes.rectangle();
        System.out.println();
        System.out.printf("%5s\n\n", "C");
        Shapes.matrix();

    }
}
