import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] array3 = new int[length];
        int n = 0;
        for (int element : array1) {
            array3[n] = element;
            n++;
        }

        for (int element : array2) {
            array3[n] = element;
            n++;
        }

        System.out.println(Arrays.toString(array3));
    }
}