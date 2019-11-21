package cn.zjf.test;

import cn.zjf.tree.ArrBinaryTree;

public class ArrBinaryTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        arrBinaryTree.preOrder();//1 2 4 5 3 6 7
        System.out.println();
        arrBinaryTree.middleOrder();//4 2 5 1 6 3 7
        System.out.println();
        arrBinaryTree.postOrder();//4 5 2 6 7 3 1
    }
}
