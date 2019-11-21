package cn.zjf.entity;

public class StuNode {
    private int no;
    private String name;
    private StuNode left;//左子树
    private StuNode right;//右子树

    public StuNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StuNode getLeft() {
        return left;
    }

    public void setLeft(StuNode left) {
        this.left = left;
    }

    public StuNode getRight() {
        return right;
    }

    public void setRight(StuNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "StuNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //前序遍历
    public void preOrder() {
        //输出父节点
        System.out.println(this);
        //递归向左子树前序遍历
        if (this.left != null) {
            this.left.preOrder();
        }
        //递归向右子树前序遍历
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    //中序遍历
    public void middleOrder() {
        //递归向左子树前序遍历
        if (this.left != null) {
            this.left.middleOrder();
        }
        //输出父节点
        System.out.println(this);
        //递归向右子树前序遍历
        if (this.right != null) {
            this.right.middleOrder();
        }
    }

    //后序遍历
    public void postOrder() {
        //递归向左子树前序遍历
        if (this.left != null) {
            this.left.postOrder();
        }
        //递归向右子树前序遍历
        if (this.right != null) {
            this.right.postOrder();
        }
        //输出父节点
        System.out.println(this);
    }

    //前序遍历查找
    public StuNode preOrderSearch(int no) {
        if (this.no == no) {
            return this;
        }
        StuNode resNode = null;
        if (this.left != null) {
            resNode = this.left.preOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.preOrderSearch(no);
        }
        return resNode;
    }

    //中序遍历查找
    public StuNode middleOrderSearch(int no) {
        StuNode resNode = null;
        if (this.left != null) {
            resNode = this.left.middleOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.no == no) {
            return this;
        }
        if (this.right != null) {
            resNode = this.right.middleOrderSearch(no);
        }
        return resNode;
    }

    //后序遍历查找
    public StuNode postOrderSearch(int no) {
        StuNode resNode = null;
        if (this.left != null) {
            resNode = this.left.postOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.postOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.no == no) {
            return this;
        }
        return resNode;
    }

    //删除节点
    public void delNode(int no) {
        //左子节点不为空且为被删除的节点
        if (this.left != null && this.left.no == no) {
            this.left = null;
            return;
        }
        //右子节点不为空且为被删除的节点
        if (this.right != null && this.right.no == no) {
            this.right = null;
            return;
        }
        //递归删除左子树下的节点
        if (this.left != null) {
            this.left.delNode(no);
        }
        //递归删除右子树下的节点
        if (this.right != null) {
            this.right.delNode(no);
        }
    }


}
