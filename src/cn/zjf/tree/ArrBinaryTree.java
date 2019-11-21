package cn.zjf.tree;

public class ArrBinaryTree {
    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    //重载前序遍历
    public void preOrder() {
        this.preOrder(0);
    }

    //顺序存储前序遍历
    public void preOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空,无法进行前序遍历");
        }
        //输出当前元素
        System.out.println(arr[index]);
        //向左递归前序遍历
        if ((2 * index + 1) < arr.length) {
            preOrder(2 * index + 1);
        }
        //向右递归前序遍历
        if ((2 * index + 2) < arr.length) {
            preOrder(2 * index + 2);
        }

    }

    //重载中序存储
    public void middleOrder() {
        this.middleOrder(0);
    }

    //顺序存储中序遍历
    public void middleOrder(int index) {
        //向左递归中序遍历
        if ((2 * index + 1) < arr.length) {
            middleOrder(2 * index + 1);
        }
        //输出
        System.out.println(arr[index]);
        //向右递归中序遍历
        if ((2 * index + 2) < arr.length) {
            middleOrder(2 * index + 2);
        }
    }

    //重载后序遍历
    public void postOrder() {
        this.postOrder(0);
    }

    //顺序存储后序遍历
    public void postOrder(int index) {
        //向左递归后序遍历
        if ((2 * index + 1) < arr.length) {
            postOrder(2 * index + 1);
        }
        //向右递归后序遍历
        if ((2 * index + 2) < arr.length) {
            postOrder(2 * index + 2);
        }
        //输出
        System.out.println(arr[index]);
    }
}
