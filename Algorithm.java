import java.util.Arrays;
import java.util.Comparator;

public class Algorithm {
    public static int maxNonOverlapping(int[][] bookings) {
        if (bookings == null || bookings.length == 0) {
            return 0;
        }
        Arrays.sort(bookings, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int lastEnd = -1;
        for (int[] booking : bookings) {
            int start = booking[0];
            int end = booking[1];
            if (start >= lastEnd) {
                count++;
                lastEnd = end;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxNonOverlapping(new int[][]{{1, 4}, {2, 5}, {5, 7}, {3, 6}, {8, 10}}));
        System.out.println(maxNonOverlapping(new int[][]{{0, 2}, {1, 3}, {2, 4}, {3, 5}}));
        System.out.println(maxNonOverlapping(new int[][]{{1, 2}, {1, 3}, {2, 3}}));
        System.out.println(maxNonOverlapping(new int[][]{{5, 10}, {1, 3}, {4, 6}, {7, 9}}));
        System.out.println(maxNonOverlapping(new int[][]{{0, 1000000}}));
    }
}
