public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("first = " + first + ", second = " + second);
        }
}