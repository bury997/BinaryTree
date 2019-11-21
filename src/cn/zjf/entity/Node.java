package cn.zjf.entity;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    //查找要删除的节点
    /**
     *
     * @param value 希望删除的节点的值
     * @return 如果找到返回该节点  否则返回null
     */
    public Node search(int value){
        if (value==this.value){
            return this;
        }else if (value<this.value){
            if (this.left==null){
                return null;
            }
            return this.left.search(value);
        }else {
            if (this.right==null){
                return null;
            }
            return this.right.search(value);
        }
    }

    //查找要删除节点的父节点
    /**
     *
     * @param value 要找到节点的值
     * @return 返回要删除节点的父节点 没找到返回null
     */
    public Node searchParent(int value){
        //如果当前节点就是要删除节点的父节点  就返回
        if ((this.left!=null&&this.left.value==value)||
                (this.right!=null&&this.right.value==value)){
            return this;
        }else{
            //如果查找的值小于当前节点的值 且当前节点的左子节点不为空
            if (value<this.value&&this.left!=null){
                return this.left.searchParent(value);//向左子树递归查找
            }else if (value>=this.value&&this.right!=null){
                return this.right.searchParent(value);//向右子树查找
            }else {
                return null;//未找到父节点
            }
        }
    }



    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    //添加结点
    public void add(Node node){
        if (node==null){
            return;
        }

        if (node.value<this.value){
            if (this.left==null){
                this.left=node;
            }else {
                this.left.add(node);
            }
        }else {
            if (this.right==null){
                this.right=node;
            }else {
                this.right.add(node);
            }
        }
    }

    //中序遍历
    public void middleOrder(){
        if (this.left!=null){
            this.left.middleOrder();
        }
        System.out.println(this);
        if (this.right!=null){
            this.right.middleOrder();
        }
    }
}
