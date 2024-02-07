package com;

import java.util.ArrayList;

public class BST {
    static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

//public static Node insert(Node root, int val){
//        if (root == null){
//            root = new Node(val);
//        }
//
//        if (root.data > val){
//            // Left SubTree
//            root.left = insert(root.left, val);
//        }else if (root.data < val){
//            // Right SubTree
//            root.right = insert(root.right, val);
//        }
//        return root;
//}

//public static boolean search(Node root, int key){  // O(H)
//        if (root == null){
//            return false;
//        }
//        if (root.data == key){
//            return true;
//        }
//
//        if (root.data > key){
//            return search(root.left, key);
//        }else {
//            return search(root.right, key);
//        }
//}

//public static void inOrder(Node root){
//        if (root == null){
//            return;
//        }
//        inOrder(root.left);
//        System.out.print(root.data + " ");
//        inOrder(root.right);
//}

//public static Node delete(Node root, int val){
//        if (root.data < val){
//            root.right = delete(root.right, val);
//        }else if (root.data > val){
//            root.left = delete(root.left, val);
//        }else {
//            // Case 1 - Leaf Node
//            if (root.left == null && root.right == null){
//                return null;
//            }
//            // Case 2 - Single Child
//            if (root.left == null){
//                return root.right;
//            }else if (root.right == null){
//                return root.left;
//            }
//            // Case 3 - Both Children Or Two children
//            Node IS = FindInOrderSuccessor(root.right);
//            root.data = IS.data;
//            root.right = delete(root.right, IS.data);
//        }
//        return root;
//}

//public static Node FindInOrderSuccessor(Node root){
//        while (root.left != null){
//            root = root.left;
//        }
//        return root;
//}

// Print In Range
//    public static void printInRange(Node root, int k1, int k2){
//        if (root == null){
//            return;
//        }
//        if (root.data >= k1 && root.data <= k2){
//            printInRange(root.left, k1, k2);
//            System.out.print(root.data + " ");
//            printInRange(root.right, k1, k2);
//        }
//        else if (root.data < k1){
//            printInRange(root.left, k1, k2);
//        }else {
//            printInRange(root.right, k1, k2);
//        }
//    }

    // Root to Leaf Path
//    public static void printPath(ArrayList<Integer> path){
//        for (int i = 0; i < path.size(); i++){
//            System.out.print(path.get(i) + " -> ");
//        }
//        System.out.println("NULL");
//    }
//    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
//        if (root == null){
//            return;
//        }
//        path.add(root.data);
//        if (root.left == null && root.right == null) {
//            printPath(path);
//        }
//        printRoot2Leaf(root.left, path);
//        printRoot2Leaf(root.right, path);
//        path.remove(path.size() - 1);
//    }

    // Validate BST
//    public static boolean isValidBST(Node root, Node min, Node max){
//        if(root == null){
//            return true;
//        }
//        if (min != null && root.data <= min.data){
//            return false;
//        }else if (max != null && root.data >= max.data){
//            return false;
//        }
//        return isValidBST(root.left, min, max) && isValidBST(root.right, root, max);
//
//
//    }

    // Mirror A BST
    public static Node CreateMirror(Node root){    // O(n)
        if (root == null){
            return null;
        }
        Node leftSubTreeMirror = CreateMirror(root.left);
        Node rightSubTreeMirror = CreateMirror(root.right);

        root.left = rightSubTreeMirror;
        root.right = leftSubTreeMirror;
        return root;
    }
    public static void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
//        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

//        int values[] = {5, 1, 3, 4, 2, 7};
//        Node root = null;
//
//        for (int i = 0; i < values.length; i++){
//            root = insert(root, values[i]);
//        }

//        inOrder(root);
//        System.out.println();

//        if (search(root, 1)){
//            System.out.println("Found");
//        }
//        else{
//            System.out.println("Not Found");
//        }

//        root = delete(root, 10);
//        System.out.println();
//
//        inOrder(root);

//        printInRange(root, 5, 12);

//        printRoot2Leaf(root, new ArrayList<>());

//        if (isValidBST(root, null, null)){
//            System.out.println("Valid");
//        }else {
//            System.out.println("Not Valid");
//        }

        // Mirror a BST
        /*
                     8
                    / \
                   5   10
                  /\     \
                 3  6    11
         */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        /*
                     8
                    / \
                   10  5
                  /   / \
                 11  6   3
           Mirror BST
         */

        root = CreateMirror(root);
        preOrder(root);
    }
}
