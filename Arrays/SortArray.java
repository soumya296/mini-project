import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr = {34, 12, 89, 56, 7};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}