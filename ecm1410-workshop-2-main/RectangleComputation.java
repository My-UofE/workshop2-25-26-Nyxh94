public class RectangleComputation {
    public static void main(String[] args) {
        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double perimeter = (2 * width) + (2 * height);
        double area = width * height;

        boolean isSquare;
        double squareRatio = height/width;

        if (squareRatio >= 0.999 && squareRatio <= 1.001){
            isSquare = true;
            System.out.println("shape: square");
        } else {
            isSquare = false;
            System.out.println("shape: rectangle");
        }
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
    }
}
