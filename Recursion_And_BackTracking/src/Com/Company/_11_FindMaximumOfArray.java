package Com.Company;

import java.util.Scanner;

public class _11_FindMaximumOfArray {

    public static int maxOfArrary(int[] arr, int idx){
        if (idx == arr.length - 1){
            return arr[idx];
        }
        int misa = maxOfArrary(arr, idx + 1);
        if (misa > arr[idx] ){
                return misa;
        }
        else {
            return arr[idx];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = maxOfArrary(arr, 0);
        System.out.println(max);
    }
}
