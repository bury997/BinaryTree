package cn.zjf.tree;

import cn.zjf.entity.Node;

public class BinarySortTree {
    private Node root;

    public void add(Node node){
        if (root==null){
            root=node;
        }else {
            root.add(node);
        }
    }

    //查找要删除的节点
    private Node search(int value){
        if (root==null){
            return null;
        }else {
            return root.search(value);
        }
    }

    //查找要删除节点的父节点
    private Node searchParent(int value){
        if (root==null){
            return null;
        }else {
            return root.searchParent(value);
        }
    }

    /**
     *
     * @param node 传入的值(作为二叉排序树的根结点)
     * @return 返回以node为根结点的二叉排序树的最大值
     */
    private int delLeftTreeMax(Node node){
        Node target = node;
        while (target.getRight()!=null){
            target=target.getRight();
        }
        delNode(target.getValue());
        return target.getValue();
    }

    //删除
    public void delNode(int value){
        if (root==null){
            return;
        }else { //找到要删除的节点 targetNode
            Node targetNode = search(value);
            if (targetNode==null){
                return;
            }
            //如果要删除的节点为根结点
            if (root.getLeft()==null&&root.getRight()==null){
                root=null;
                return;
            }
            //找到要删除节点的父节点
            Node parentNode = searchParent(value);
            //如果删除的节点是叶子节点
            if (targetNode.getLeft()==null&&targetNode.getRight()==null){
                //如果要删除的节点是父节点的左子节点
                if (parentNode.getLeft()!=null&&parentNode.getLeft().getValue()==value){
                    parentNode.setLeft(null);
                    //如果要删除的节点是父节点的右子节点
                }else if (parentNode.getRight()!=null&&parentNode.getRight().getValue()==value){
                    parentNode.setRight(null);
                }
                //删除有两颗子树的节点
            }else if (targetNode.getLeft()!=null&&targetNode.getRight()!=null){
                int intMax = delLeftTreeMax(targetNode.getLeft());
                targetNode.setValue(intMax);
            }else {//删除只有一颗子树的节点
                //如果要删除的节点有左子节点
                if (targetNode.getLeft()!=null){
                    //如果要删除的节点是父节点的左子节点
                    if(parentNode.getLeft().getValue()==value){
                        parentNode.setLeft(targetNode.getLeft());
                    }else{//如果要删除的节点是父节点的右子节点
                        parentNode.setRight(targetNode.getLeft());
                    }
                }else {//如果要删除的节点有右子节点
                    //如果要删除的节点是父节点的左子节点
                    if(parentNode.getLeft().getValue()==value){
                        parentNode.setLeft(targetNode.getRight());
                    }else{//如果要删除的节点是父节点的右子节点
                        parentNode.setRight(targetNode.getRight());
                    }
                }
            }


        }
    }




    //中序遍历
    public void middleOrder(){
        if (root!=null){
            root.middleOrder();
        }else {
            System.out.println("空树,不能中序遍历");
        }
    }
}
