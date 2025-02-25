import java.lang.reflect.Array;
import java.util.*;

public class ArraysInMyPants {
    //3.7.5
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

    //3.7.4

    public static int max1(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
    public static int min1(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) min= num;
        }
        return min;
    }

    public static int sum1(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int mean1(int[] array) {
        return sum(array)/array.length;
    }

    public static int mode1(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:array){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static int[] reverse1(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i= array.length-1;i>-1;i--) {
            list.add(array[i]);
        }
        int[] array1 = (int[]) list.toArray();
        return array1;
    }
    //yes im mutating the array
    public static void shift1(int[] array,int position) {
        for (int i = position-1; i >= 0; i--) {
            array[i+1] = array[i];
        }
    }
}
