public class MatrixMultiplier {
    public static void main(String[] args) {
        int [][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int [][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };
        int result = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result += first[i][j];
            }
        }
        System.out.println("First sum = " + result);

        int result1 = 0;
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[i].length; j++) {
                result1 += second[i][j];
            }
        }
        System.out.println("Second sum = " + result1);
    }
}
