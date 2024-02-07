package com;

import java.sql.SQLOutput;
import java.util.*;

public class BinaryTreesB {
//    static class Node{
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data){
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }

    /*
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
     */

    /*
    public static void preOrder(Node root){      //   O(n)
            if (root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
    }
     */

    /*
    public static void InOrder(Node root){        // O(n)

            if (root == null){
                return;
            }
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
    }
     */

    /*
    public static void PostOrder(Node root){
        if (root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }
     */

    /*
    // Level Order Traversal
        public static void levelOrder(Node root){
            if (root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode == null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null){
                        q.add(currNode.left);
                    }
                    if (currNode.right != null){
                    q.add(currNode.right);
                    }
                }
            }
        }
}
*/

    /*
    //      Height of A Tree
    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Count Of Node
    public static int count(Node root){
        if (root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    // Sum of Node
    public static int sum(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    // Diameter Of a Tree
    public static int diameter1(Node root){    // O(n^2)
        if (root == null){
            return 0;
        }
        int leftDiam = diameter1(root.left);
        int leftH = height(root.left);
        int rightDiam = diameter1(root.right);
        int rightH = height(root.right);

        int selfDiam = leftH + rightH + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    }

    // O(n)
    static class Info{
        int dim;
        int ht;
        public Info(int dim, int ht){
            this.dim = dim;
            this.ht = ht;
        }
    }

    public static Info diameter3(Node root){
        if (root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter3(root.left);
        Info rightInfo = diameter3(root.right);

        int dim = Math.max(Math.max(leftInfo.dim, rightInfo.dim), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.min(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(dim, ht);
    }

     */

    /*
    // SubTree
    public static boolean isIdentical(Node node, Node sunRoot){
        if (node == null && sunRoot == null){
            return true;
        }else if (node == null || sunRoot == null || node.data != sunRoot.data){
            return false;
        }
        if (!isIdentical(node.left, sunRoot.left)){
            return false;
        }
        if (!isIdentical(node.right, sunRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subRoot){
        if (root == null){
            return false;
        }
        if (root.data == subRoot.data){
            if (isIdentical(root, subRoot)){
                return true;
            }
        }

        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root.right, subRoot);

        return leftAns || rightAns;

    }
     */

//    static class Info{
//        Node node;
//        int hd;
//
//        public Info(Node node, int hd){
//            this.node = node;
//            this.hd = hd;
//        }
//    }
//
//    public static void topView(Node root){
//        // Level Order
//        Queue<Info> q = new LinkedList<>();
//        HashMap<Integer, Node> map = new HashMap<>();;
//
//        int min = 0, max = 0;
//        q.add(new Info(root, 0));
//        q.add(null);
//
//        while (!q.isEmpty()){
//            Info curr = q.remove();
//            if (curr == null){
//                if (q.isEmpty()){
//                    break;
//                }else {
//                    q.add(null);
//                }
//            }else {
//                if (map.containsKey(curr.hd)){    // First time my horizontal distance is Occurring
//                    map.put(curr.hd, curr.node);
//                }
//                if (curr.node.left != null){
//                    q.add(new Info(curr.node.left, curr.hd - 1));
//                    min = Math.min(min, curr.hd - 1);
//                }
//                if (curr.node.right != null){
//                    q.add(new Info(curr.node.right, curr.hd + 1));
//                    max = Math.max(max, curr.hd + 1);
//                }
//            }
//        }
//        for (int i = min; i <= max; i++){
//            System.out.print(map.get(i).data);
//        }
//        System.out.println();
//    }

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

    // Kth Level of a Tree
//   public static void KLevel(Node root, int level, int k){
//        if (root == null){
//            return;
//        }
//        if (level == k){
//            System.out.print(root.data + " ");
//            return;
//        }
//        KLevel(root.left, level + 1, k);
//        KLevel(root.right, level + 1, k);
//
//   }

    // Approach No. (I)
//   public static boolean getPath(Node root, int n, ArrayList<Node> path){
//        if (root == null){
//            return false;
//        }
//        path.add(root);
//
//        if (root.data == n){
//            return true;
//        }
//
//        boolean foundLeft = getPath(root.left, n, path);
//        boolean foundRight = getPath(root.right, n, path);
//
//        if (foundLeft || foundRight){
//            return true;
//        }
//
//        path.remove(path.size() - 1);
//        return false;
//   }

   // Lowest Common Ancestor
//    public static Node LowestCommonAncestor(Node root, int n1, int n2){      // O(n)
//        ArrayList<Node> path1 = new ArrayList<>();
//        ArrayList<Node> path2 = new ArrayList<>();
//
//        getPath(root, n1, path1);
//        getPath(root, n2, path2);
//
//        // Last Common Ancestor
//        int i = 0;
//        for (;i < path1.size() && i < path2.size(); i++){
//            if (path1.get(i) != path2.get(i)){
//                break;
//            }
//        }
//        // Last Equal Node -> (i - 1)th
//
//        Node LowestCommonAncestor = path1.get(i-1);
//        return LowestCommonAncestor;
//    }

    // Approach No. (II)
//    public static Node Lca(Node root, int n1, int n2){
//        if (root == null || root.data == n1 || root.data == n2){
//            return root;
//        }
//
//        Node leftLca = Lca(root.left, n1, n2);
//        Node rightLca = Lca(root.right, n1, n2);
//
//        if (rightLca == null){
//            return leftLca;
//        }
//        if (leftLca == null){
//            return rightLca;
//        }
//        return root;
//    }

    // Min Distance Between Nodes
//        public static Node lca(Node root, int n1, int n2){
//        if (root == null || root.data == n1 || root.data == n2){
//            return root;
//        }
//
//        Node leftLca = lca(root.left, n1, n2);
//        Node rightLca = lca(root.right, n1, n2);
//
//        if (rightLca == null){
//            return leftLca;
//        }
//        if (leftLca == null){
//            return rightLca;
//        }
//        return root;
//    }

//    public static int lcaDist(Node root, int n){
//        if (root == null){
//            return -1;
//        }
//        if (root.data == n){
//            return 0;
//        }
//
//        int leftDist = lcaDist(root.left, n);
//        int rightDist = lcaDist(root.right, n);
//
//        if (leftDist == -1 && rightDist == -1){
//            return -1;
//        }else if (leftDist == -1){
//            return rightDist + 1;
//        }else {
//            return leftDist + 1;
//        }
//
//    }
//    public static int minDist(Node root, int n1, int n2) {
//        Node lca3 = lca(root, n1, n2);
//        int dist1 = lcaDist(lca3, n1);
//        int dist2 = lcaDist(lca3, n1);
//
//        return dist1 + dist2;
//
//    }

    // Kth Ancestor of node
//    public static int KthAncestor(Node root, int n, int k){
//        if (root == null){
//            return -1;
//        }
//        if (root.data == n){
//            return 0;
//        }
//        int leftDist = KthAncestor(root.left, n, k);
//        int rightDist = KthAncestor(root.right, n, k);
//
//        if (leftDist == -1 && rightDist == -1){
//            return -1;
//        }
//        int max = Math.max(leftDist, rightDist);
//        if (max + 1 == k){
//            System.out.println(root.data);
//        }
//        return max + 1;
//    }

    // Transform to sum Tree
    public static int transform(Node root){
        if (root == null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        int newLeftData = root.left == null ? 0 : root.left.data;
        int newRightData = root.left == null ? 0 : root.right.data;

        root.data = newLeftData + leftChild + newRightData + rightChild;
        return data;

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
        // Question Binary Tree
        //           1
        //         /   \
        //        2     3
        //       / \   / \
        //      4   5 7   6

        // Expected sum tree is
        //           27
        //          /  \
        //         9    13
        //        / \   / \
        //       0   0 0   0

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Transform to sum Tree
        transform(root);
        preOrder(root);

//        int n = 5, k = 2;
        // Kth Ancestor of node
//        KthAncestor(root, n, k);

//        int n1 = 4, n2 = 5;

        // Min Distance Between Nodes
//        System.out.println(minDist(root, n1, n2));

        // Lowest Common Ancestor
        // Approach No. (I)
//        System.out.println(LowestCommonAncestor(root, n1, n2).data);
        // Approach No. (II)
//        System.out.println(Lca(root, n1, n2).data);

        // Kth Level of a Tree
//        int k = 2;
//        KLevel(root,1, k);

//        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        BinaryTree tree = new BinaryTree();
//        Node root = tree.buildTree(nodes);

//        System.out.println(root.data);

//        tree.preOrder(root);

//        tree.InOrder(root);

//        tree.PostOrder(root);

//        tree.levelOrder(root);


        // Question Binary Tree
        //           1
        //         /   \
        //        2     3
        //       / \   / \
        //      4   5 7   6

//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

//        topView(root);

        // SubTree
        //            2
        //           / \
        //          4   5
//        Node subRoot = new Node(2);
//        subRoot.left = new Node(4);
//        subRoot.right = new Node(5);

//        System.out.println(isSubtree(root, subRoot));

        /*
        // Height of A Tree
        System.out.println(height(root));

        // Count Of Node
        System.out.println(count(root));

        // Sum Of Node
        System.out.println(sum(root));

        // DiamMeter of Node
        System.out.println(diameter1(root));

        System.out.println(diameter3(root).dim);
        System.out.println(diameter3(root).ht);
        */

    }
}
