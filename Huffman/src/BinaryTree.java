public class BinaryTree {

	public BinaryTree() {
		
	}

	class Node<T extends Comparable<?>> {
	    Node<T> left, right;
	    T data;

	    public Node(T data) {
	        this.data = data;
	    }
	}
}
