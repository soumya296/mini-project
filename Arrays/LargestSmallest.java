import java.util.Arrays;

public class LargestSmallest {

    public static void main(String[] args) {

        int[] arr = {34, 12, 89, 56, 7, 99};

        Arrays.sort(arr);

        System.out.println("Smallest Two Numbers:");
        System.out.println(arr[0] + " " + arr[1]);

        System.out.println("Largest Two Numbers:");
        System.out.println(arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}