package Com.Company;

import java.util.Scanner;

public class _13_LastIndexOfOccurrence {

    public static int lastIndex(int[] arr, int idx, int x){
        if (idx == arr.length){
            return -1;
        }
        int liisa = lastIndex(arr, idx + 1, x);
        if (liisa == - 1){
            if (arr[idx] == x){
                return idx;
            }else {
                return -1;
            }
        }
        else {
            return liisa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int li = lastIndex(arr, 0, x);
        System.out.println(li);
    }
}
