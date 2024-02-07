package Com.Company;

public class _15_Array {
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
//        int [] arr;
//        arr = new int[5];
//        arr[0]= 71;
//        arr[1]= 72;
//        arr[2]= 73;
//        arr[3]= 74;
//        arr[4]= 75;
//        System.out.println(arr.length);
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);

        int [] arr;
        arr = new int[5];
        arr[0]= 71;
        arr[1]= 72;
        arr[2]= 73;
        arr[3]= 74;
        arr[4]= 75;

        swap(arr, 0, 4);

       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
    }
}
