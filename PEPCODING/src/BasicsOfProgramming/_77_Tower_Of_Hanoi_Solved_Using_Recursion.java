package BasicsOfProgramming;

import java.util.Scanner;

public class _77_Tower_Of_Hanoi_Solved_Using_Recursion {

    public static void towerOfHanoi(int n, int t1id, int t2id, int t3id){
        if (n == 0)
        {
            return;
        }
        towerOfHanoi(n - 1, t1id, t3id, t2id); // Will print the instruction to move n - 1 disks from t1 to t3 using t2(*)
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        towerOfHanoi(n - 1, t3id, t2id, t1id);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1d = scn.nextInt();
        int t2d = scn.nextInt();
        int t3d = scn.nextInt();
        towerOfHanoi(n, t1d, t2d, t3d);
    }
}
