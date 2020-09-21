package Tree_L.BinaryTree_L;

public class JavaBinaryTree {
    public static void main(String[] args) {
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
    // -----------以下为二叉树的功能实现----------
    private Node root; // 保存的是根节点

    /**
     * 进行数据的保存
     * @param data 要保存的数据内容
     * @exception NullPointerException 保存数据为空时抛出的异常
     */
    public void add(Comparable<T> data) {
        if (data == null) {
            throw new NullPointerException("保存的数据不允许为空！");
        }
        // 所有的数据本身不具备接待你关系的匹配，那么一定要将其包装在Node类之中
        Node newNode = new Node(data); // 保存节点
        if (this.root == null) { // 现在没有根节点，则第一个节点作为根节点
            this.root = newNode;
        } else {

        }
    }
}