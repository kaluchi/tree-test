package app;


/**
 * @author Kalitko.Evgeny
 *
 */
public class Main {

	public static void main(String[] args) {
		int maxTreeDepth = getMaxTreeDepth(NodeImpl.testCase01());
		System.out.println(maxTreeDepth);
	}

	public static int getMaxTreeDepth(Node arbitraryNode) {
		return getDeepestNode(getRoot(arbitraryNode));
	}

	public static Node getRoot(Node node) {
		Node root = node;

		while (root.getParent() != null) {
			root = root.getParent();
		}

		return root;
	}

	public static int getDeepestNode(Node node) {
		int max = 0;

		if(node.getChildren().isEmpty()) {
			max = Math.max(max, getLevel(node));
		}
		else {
			for(Node child : node.getChildren()) {
				max = Math.max(getDeepestNode(child), max);
			}
		}

		return max;
	}

	public static int getLevel(Node node) {
		int level = 0;

		while (node.getParent() != null) {
			node = node.getParent();
			level++;
		}

		return level;
	}

}
