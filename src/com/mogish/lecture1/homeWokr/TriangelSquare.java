public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        int length = 0;
        float square = 0;
        double S;

        S = (0.5*((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)));

        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + S);
    }
}
