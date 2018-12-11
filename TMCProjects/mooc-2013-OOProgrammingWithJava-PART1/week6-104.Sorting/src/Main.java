import java.util.Arrays;

public class Main {


    public static int smallest(int[] array) {
        // write the code here
        int x = array[0];
        for (int y : array) {
            if (y < x) {
                x = y;
            }
        }
        return x;
    }

    public static int indexOfTheSmallest(int[] array) {
        int x = 0;
        for (int i=0; i< array.length; i++) {
            if (array[i] < array[x]) { x = i; }
        }
        return x;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest=index;
        for (int i = index; i <array.length ; i++) {
            if(array[i] < array[smallest]){smallest =i;}
        }
        return smallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int x = array[index1];
        array[index1] = array[index2];
        array[index2] = x;
    }


    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }


    public static void main(String[] args) {
        // write testcode here

        int[] values1 = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values1));

        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

        // indexes:    0  1  2  3   4
        int[] values2 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values2, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 4));


        int[] values3 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values3));

        swap(values3, 1, 0);
        System.out.println(Arrays.toString(values3));

        swap(values3, 0, 3);
        System.out.println(Arrays.toString(values3));


    }

}
