package cn.zjf.test;

import cn.zjf.entity.StuNode;
import cn.zjf.tree.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        StuNode root = new StuNode(1,"A");
        StuNode node1 = new StuNode(2,"B");
        StuNode node2 = new StuNode(3,"C");
        StuNode node3 = new StuNode(4,"D");
        StuNode node4 = new StuNode(5,"E");
        StuNode node5 = new StuNode(6,"F");

        bt.setRoot(root);
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node2.setLeft(node4);
        node2.setRight(node5);

        bt.preOrder();      //1 2 4 3 5 6
        System.out.println();
        bt.middleOrder();   //4 2 1 5 3 6
        System.out.println();
        bt.postOrder();     //4 2 5 6 3 1

        bt.postOrder();
        System.out.println();
        bt.delNode(3);

        System.out.println();
        bt.postOrder();     //4 2 1  删除了右子树(3,"C")
    }
}
