package Arrays;

public class SecondSmallest {
    static private int secondSmallest(int arr[], int n) {
        if (n < 2) {
            return -1;
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int n = arr.length;
        System.out.println("Second smallest element is: " + secondSmallest(arr, n));

    }
}
