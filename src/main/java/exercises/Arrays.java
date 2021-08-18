package exercises;

public class Arrays {
    public static void main(String[] args) {
        double[] studentOne = new double[6];

        studentOne[0] = 5;
        studentOne[1] = 8.5;
        studentOne[2] = 10;
        studentOne[3] = 6.0;

        for (double x : studentOne) {
            System.out.println(x);
        }

        System.out.println(java.util.Arrays.toString(studentOne));

        double res = 0;

        for (int i = 0; i < studentOne.length ; i++) {
            res += studentOne[i];
        }

        System.out.println(res/6);

        double[] studentTwo = {6.9, 8.0, 6.5, 10.0, 7.5, 6.0};

        for (double x : studentTwo) {
            System.out.println(x);
        }
    }
}
