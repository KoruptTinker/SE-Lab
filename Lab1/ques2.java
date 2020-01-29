package Lab1;

import java.util.Scanner;

public class ques2 {
    int size;
    int[] arr;

    public void insertion(int[] arr) {
        int key, j;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ques2 t = new ques2();
        t.size = sc.nextInt();
        t.arr = new int[t.size];
        for (int i = 0; i < t.size; i++) {
            t.arr[i] = sc.nextInt();
        }
        sc.close();
        t.insertion(t.arr);
        System.out.println();
        for (int i = 0; i < t.size; i++) {
            System.out.print(t.arr[i]);
            System.out.print(",");
        }
        System.out.println();
    }
}