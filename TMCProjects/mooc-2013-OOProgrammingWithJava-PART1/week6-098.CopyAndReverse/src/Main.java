

public class Main {

    public static void main(String[] args) {
        // write testcode here

    }

    public static int[] copy(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

    public static int[] reverseCopy(int[] array) {

        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[(array.length - i) - 1];
        }
        return newArr;
    }
}
