package cn.zjf.test;

import cn.zjf.entity.Node;
import cn.zjf.tree.BinarySortTree;

public class BinarySortTreeTest {
    public static void main(String[] args) {
        int[] arr = {5,15,24,26,4,98,44,32};
        BinarySortTree binarySortTree = new BinarySortTree();
        for (int i = 0; i < arr.length; i++) {//创建二叉排序树
            binarySortTree.add(new Node(arr[i]));
        }
        binarySortTree.middleOrder();// 4 5 15 24 26 32 44 98  中序遍历

        System.out.println();
        binarySortTree.delNode(32);//删除值为32的节点(叶子结点)
        binarySortTree.middleOrder();

        System.out.println();
        binarySortTree.delNode(44);//删除值为44的节点(有一颗子树的节点)
        binarySortTree.delNode(15);
        binarySortTree.middleOrder();

        System.out.println();
        binarySortTree.delNode(5);//删除值为5的节点(有两颗子树的节点)
        binarySortTree.middleOrder();


    }
}
