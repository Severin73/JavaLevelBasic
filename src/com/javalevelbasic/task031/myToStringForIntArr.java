package com.javalevelbasic.task031;

/**
 * Write your own version of the Arrays.toString() method for int[].
 */
public class myToStringForIntArr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 73};
        System.out.println(myToString(arr));
    }

    /**
     * Create a string representation of the int[] array.
     * @param arr
     * @return
     */
    private static String myToString(int[] arr) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
