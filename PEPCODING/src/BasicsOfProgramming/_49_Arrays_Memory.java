package BasicsOfProgramming;

public class _49_Arrays_Memory {
    public static void swap(int [] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int [] arr;
        arr = new int[5];
        arr[0] = 93;
        arr[1] = 43;
        arr[2] = 73;
        arr[3] = 33;
        arr[4] = 53;

//        int[] two = arr;
//        two[2] = 222;

        swap(arr, 0, 2);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
