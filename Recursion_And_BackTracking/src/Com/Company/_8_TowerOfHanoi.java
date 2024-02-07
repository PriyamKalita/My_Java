package Com.Company;

import java.util.Scanner;

public class _8_TowerOfHanoi {

    public static void Toh(int n, int t1id, int t2id, int t3id){
        if (n == 0){
            return;
        }
        Toh(n - 1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + "->" + t2id + "]" );
        Toh(n - 1, t3id, t3id, t1id);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1d = sc.nextInt();
        int t2d = sc.nextInt();
        int t3d = sc.nextInt();
        Toh(n, t1d, t2d, t3d);
    }
}
