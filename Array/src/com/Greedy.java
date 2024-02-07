package com;
import java.util.*;
public class Greedy {
    static class job{
        int deadLine;
        int profit;
        int id;
        public job(int i , int d, int p){
            id  = i;
            deadLine = d;
            profit = p;
        }
    }

    public static void main(String[] args) {

        /*
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        // end time Basic Sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++){
            if (start[i] >= lastEnd){
                // Activity Select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
        */

        /*
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // Soring
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda function -> shortfrom
        Arrays.sort(activities, Comparator.comparing(o -> o[2]));


        // end time Basic Sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++){
            if (activities[i][1] >= lastEnd){
                // Activity Select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max Activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
        */

        /*
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx ; 1st col => ratio

        for (int i = 0; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        // Ascending order
        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));

        int capacity = W;
        int finalValue = 0;
        for (int i = ratio.length - 1; i >= 0; i--){
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]){
                finalValue += val[idx];
                capacity -= weight[idx];
            }else {
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value = " + finalValue);
        */

        /*
        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("The Minimum Absolute difference of Pair = " + minDiff);
        */

        /*
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparing(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1];     // Last Selected pair end // Chain End


        for (int i = 1; i < pairs.length; i++){
            if (pairs[i][0] > chainEnd){
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of Chain = " + chainLength);
        */

        /*
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int countOdCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++){
            if (coins[i] <= amount){
                while (coins[i] < amount){
                    countOdCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used = " + countOdCoins);
        for (int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        */

        /*
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<job> jobs = new ArrayList<>();

        for (int i  = 0; i < jobsInfo.length; i++){
            jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++){
            job curr = jobs.get(i);
            if (curr.deadLine > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max job = " + seq.size());
        for (int i = 0; i < seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
        */

        int n = 4, m = 6;
        Integer costVar[] = {2, 1, 3, 1, 4};
        Integer costHar[] = {4, 1, 2};

        Arrays.sort(costVar, Collections.reverseOrder());
        Arrays.sort(costHar, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHar.length && v < costVar.length){
            if (costVar[v] <= costHar[h]){
                cost += (costHar[h] * vp);
                hp++;
                h++;
            }else {
                cost += (costVar[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHar.length){
            cost += (costHar[h] * vp);
            hp++;
            h++;
        }
        while (v < costVar.length){
            cost += (costVar[h] * hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost of cuts = " + cost);
    }
}
