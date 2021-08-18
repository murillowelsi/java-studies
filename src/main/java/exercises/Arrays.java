package exercises;

public class Arrays {
    static double[] studentOne = new double[6];

    public static void main(String[] args) {
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

    }
}
