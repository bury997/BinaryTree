package cn.zjf.tree;

import cn.zjf.entity.StuNode;

public class BinaryTree {
    private StuNode root;//根结点

    public void setRoot(StuNode root) {
        this.root = root;
    }

    //前序遍历
    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("根结点为空,无法遍历");
        }
    }

    //中序遍历
    public void middleOrder() {
        if (this.root != null) {
            this.root.middleOrder();
        } else {
            System.out.println("二叉树为空,无法遍历");
        }
    }

    //后序遍历
    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("二叉树为空,无法遍历");
        }
    }

    //前序遍历查找
    public StuNode preOrderSearch(int no) {
        if (root != null) {
            return root.preOrderSearch(no);
        } else {
            return null;
        }
    }

    //中序遍历查找
    public StuNode middleOrderSearch(int no) {
        if (root != null) {
            return root.middleOrderSearch(no);
        } else {
            return null;
        }
    }

    //后序遍历查找
    public StuNode postOrderSearch(int no) {
        if (root != null) {
            return root.postOrderSearch(no);
        } else {
            return null;
        }
    }

    //删除节点
    public void delNode(int no){
        if (root!=null){
            if (root.getNo()==no){
                root=null;
            }else {
                root.delNode(no);
            }
        }else {
            System.out.println("空树,不能删除");
        }
    }

}
