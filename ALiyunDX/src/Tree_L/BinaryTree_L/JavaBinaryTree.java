package Tree_L.BinaryTree_L;

public class JavaBinaryTree {
    public static void main(String[] args) {
        System.out.println();
    }
}

/**
 * 实现二叉树的操作
 * @param <T> 要进行二叉树的实现
 */
class BinaryTree<T extends Comparable<T>> {
    private class Node {
        private Comparable<T> data; // 存放Comparable，可以比较大小
        private Node parent; // 存父节点
        private Node left; // 保存左子树
        private Node right; // 保存右子树
        public Node(Comparable<T> data) { // 构造方法直接负责数据的存储
            this.data = data;
        }
    }
}