package com;

public class Array_Binary_Search_Question {
    //           (1)
//    public static void reverseArray(int number[]) {
//
//        int first = 0;
//        int last = number.length - 1;
//        while (first < last){
//            // Swap Element of Array  = { 2, 4, 6, 8, 10}
//            int temp = number[last];
//            number[last] = number[first];
//            number[first] = temp;
//
//            first++;
//            last--;
//
//        }
//        return;
//    }

    //                  (2)
//    public static void printPairs(int number[]) {
//        int totalPairs = 0;
//        for (int i = 0; i < number.length; i++){
////             int currentNum = number[i];
//            for (int j = i + 1; j < number.length; j++){
//                System.out.print("(" + number[i] + "," + number[j] + ")");
////                System.out.print("(" + currentNum + "," + number[j] + ")");
//                totalPairs++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total number of pairs : " + totalPairs);
//    }

    //                   (3)
//    public static void subArray(int number[]){
//        int ts = 0;
//        for (int i = 0; i < number.length; i++){
//            for (int j = i; j < number.length; j++){
//               for (int k = i; k <= j; k++){   // i = start and j = end
//                   System.out.print(number[k] + " ");
//               }
//                ts++;
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println("Total number of SubArrays : " + ts);
//    }

    //                  (4)
    //                  (i)
//    public static void subArrayMax(int number[]){
//        int currentSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < number.length; i++){
//            for (int j = i; j < number.length; j++){
//               currentSum = 0;
//               for (int k = i; k <= j; k++)
//               {
//                   System.out.print(number[k] + " ");
//                   currentSum = currentSum + number[k];
//               }
//               System.out.println(" The num of pairs : "+ currentSum);
//               if (maxSum < currentSum)
//               {
//                   maxSum = currentSum;
//               }
//            }
//            System.out.println();
//        }
//        System.out.println("Max of sum : " + maxSum);
//    }

    //                       (ii)
//    public static void subArrayMax(int number[]){
//        int currentSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//
//        int prefix[] = new int[number.length];
//        prefix[0] = number[0];
//        // Calculate Prefix Array
//        for (int i = 1; i < prefix.length; i++){
//            prefix[i] = prefix[i - 1] + number[i];
//        }
//
//        for (int i = 0; i < number.length; i++){
//            int start = i;
//            for (int j = i; j < number.length; j++){
//                int end = j;
//               currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1] ;
//
//                System.out.println(" The num of pairs : "+ currentSum);
//               if (maxSum < currentSum)
//               {
//                   maxSum = currentSum;
//               }
//            }
//        }
//        System.out.println("Max of sum : " + maxSum);
//    }

    //                     (5)
//    public static void kadanes(int number[]){
//        int maximumSum = Integer.MIN_VALUE;
//        int currentSum = 0;
//
//        for (int i = 0; i < number.length; i++){
//            currentSum = currentSum + number[i];
//            if (currentSum < 0)
//            {
//                currentSum = 0;
//            }
//            maximumSum = Math.max(currentSum, maximumSum);
//        }
//        System.out.println("Our maxSubArray Sum is : " + maximumSum);
//    }

    //              (6)
//    public static int trappedRainWater(int height[]){
//
//        // Calculate left max Boundary - Array
//        int leftMax[] = new int[height.length];
//        leftMax[0] = height[0];
//        for (int i = 1; i < height.length; i++)
//        {
//            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//        }
//
//        // Calculate right max boundary - Array
//        int rightMax[] = new int[height.length];
//        rightMax[height.length - 1] = height[height.length - 1];
//        for (int i = height.length - 2; i >= 0; i--)
//        {
//            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//        }
//
//        int trappedwater = 0;
//        // Loop
//        for (int i = 0; i < height.length; i++)
//        {
//            // waterLevel = min(leftmax bound, right bound)
//            int waterLevel  = Math.min(leftMax[i], rightMax[i]);
//            trappedwater += waterLevel - height[i];
//        }
//        return trappedwater;
//    }

    //                     (7)
//    public static int BuyAndSellStock(int prices[])
//    {
//        int buyPrice = Integer.MAX_VALUE;
//        int maxProfit  = 0;
//
//        for (int i = 0; i < prices.length; i++)
//        {
//            if (buyPrice < prices[i]) // Profit
//            {
//                int profit = prices[i] - buyPrice; // Today's Profit
//                maxProfit = Math.max(maxProfit, profit);
//            }
//            else
//            {
//                buyPrice = prices[i];
//            }
//        }
//        return maxProfit;
//    }

    public static void main(String[] args) {
        // Question No. (1) : Reverse an Array
//        int number[] = {2, 4, 6, 8, 10};
//        reverseArray(number);
//        // Print Final Reverse Array
//        for (int i = 0; i < number.length; i++){
//            System.out.print(number[i] + " ");
//        }
//        System.out.println();

        // Question No. (2) : Pairs in an array
        //  (2, 4), (2, 6), (2, 8), (2, 10)
        //  (4, 6), (4, 8), (4, 10)
        //  (6, 8), (6, 8)
        //  (8, 10)
//        int number[] = {2, 4, 6, 8, 10};
//        printPairs(number);
//        System.out.println();

        // Question No. (3) : Print SubArray (int number[] = {2, 4, 6, 8, 10};
        // {2}, {2, 4}, {2, 4, 6}, {2, 4, 6, 8}, {2, 4, 6, 8, 10}
        // {4}, {4, 6}, {4, 6, 8}, {4, 6, 8, 10}
        // {6}, {6, 8}, {6, 8, 10}
        // {8}, {8, 10}
        // {10}
//        int number[] = {2, 4, 6, 8, 10};
//        subArray(number);

        // Question No. (4) : Print max of subArray sum
//        int number[] = {1, -2, 6, -1, 3};
//        subArrayMax(number);

        // Question No. (5) : Print SubArray Sum (KADANE's Algorithm)
//        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//        kadanes(number);

        // Question No. (6) : Trapping RainWater
//        int height[] = {4, 2, 0, 6, 3, 2, 5};
//        System.out.println(trappedRainWater(height));

        // Question No. (7) : Buy abs Sell Stocks
//        int prices[] = {7, 1, 5, 3, 6, 4};
//        System.out.println(BuyAndSellStock(prices));

    }
}
