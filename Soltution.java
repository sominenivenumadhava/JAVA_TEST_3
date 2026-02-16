package test3.com;

import java.util.Scanner;

class Solution {
    public static void findMinMax(int[] numbers) {
        int n = numbers.length;

        if (numbers == null) {
            System.out.println("array is empty: ");
        }
        if(n == 0){
            System.out.println("array is empty: ");
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("the maximum numbers is :" + max);
        System.out.println("the minimum numbers is :" + min);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("how many number you want to add in array: ");
        int a = s.nextInt();

        if (a <= 0) {
            System.out.println("the array is empty");
        }

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }
        findMinMax(arr);

        s.close();
    }
}

