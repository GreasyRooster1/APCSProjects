import java.util.*;

public class ArraysInMyPants {
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static int count(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num == value) count++;
        }
        return count;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int minOdd(int[] array) {
        int minOdd = Integer.MAX_VALUE;
        boolean found = false;
        for (int num : array) {
            if (num % 2 != 0 && num < minOdd) {
                minOdd = num;
                found = true;
            }
        }
        return found ? minOdd : -1;
    }

    public static boolean containsDuplicate(int[] array) {
        ArrayList<Integer> seen= new ArrayList<>();
        for (int num : array) {
            if(seen.contains(num)){
                return true;
            }

            seen.add(num);
        }
        return false;
    }

    public static int[] even(int[] array) {
        return Arrays.stream(array).filter(num -> num % 2 == 0).toArray();
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int sortOrder(int[] array) {
        boolean asc = true;
        boolean desc = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]){
                desc = false;
            }
            if (array[i] < array[i - 1]) {
                asc = false;
            }
        }
        return asc ? 1 : desc ? -1 : 0;
    }
}
