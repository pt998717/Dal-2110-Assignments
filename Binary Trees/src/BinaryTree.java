
/**
 * Class provided by Srini
 * @param <T>
 */
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTree<T>{
	private T data;
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;

	public BinaryTree(){
		parent = left = right = null;
		data = null;
	}

	public void makeRoot(T data){
		if (!isEmpty()){
			System.out.println("Can't make root. Already exists");
		}
		else
			this.data = data;
	}

	public void setData(T data){
		this.data = data;
	}

	public void setLeft(BinaryTree<T> tree){
		left = tree;
	}

	public void setRight(BinaryTree<T> tree){
		right = tree;
	}

	public void setParent(BinaryTree<T> tree){
		parent = tree;
	}

	public T getData(){
		return data;
	}

	public BinaryTree<T> getParent(){
		return parent;
	}

	public BinaryTree<T> getLeft(){
		return left;
	}

	public BinaryTree<T> getRight(){
		return right;
	}

	public void attachLeft(BinaryTree<T> tree){
		if (tree==null) return;
		else if (left!=null || tree.getParent()!=null){
			System.out.println("Can't attach");
			return;
		}
		else{
            tree.setParent(this);
            this.setLeft(tree);
		}
	}

	public void attachRight(BinaryTree<T> tree){
		if (tree==null) return;
		else if (right!=null || tree.getParent()!=null){
			System.out.println("Can't attach");
			return;
		}
		else{
            tree.setParent(this);
            this.setRight(tree);
		}
	}

	public BinaryTree<T> detachLeft(){
		if (this.isEmpty()) return null;
		BinaryTree<T> retLeft = left;
		left = null;
		if (retLeft!=null) retLeft.setParent(null);
		return retLeft;
	}

	public BinaryTree<T> detachRight(){
		if (this.isEmpty()) return null;
		BinaryTree<T> retRight = right;
		right =null;
		if (retRight!=null) retRight.setParent(null);
		return retRight;
	}

	public boolean isEmpty(){
		if (data == null)
			return true;
		else
			return false;
	}

	public void clear(){
		left = right = parent =null;
		data = null;
	}

	public BinaryTree<T> root(){
		if (parent == null)
			return this;
		else{
			BinaryTree<T> next = parent;
			while (next.getParent()!=null)
				next = next.getParent();
			return next;
		}
	}

    public static<T> int nodes(BinaryTree<T> t){
      //TODO
    	if(t == null) {
    		return 0; //the tree is empty
    	}else {
    		int count = 1;//counting the root
    		count += nodes(t.left);//left subtree
    		count += nodes(t.right);//right subtree
    		return count;
    	}

    }

    public static<T> int height(BinaryTree<T> t){
        //TODO
    	//null return -1
    	if(t == null) {
    		return -1;
    	}
    	//call the height method itself
    	int leftlength = height(t.left);
    	int rightlength = height(t.right);
    	//if left height longer than right then left add 1
    	if(leftlength>rightlength) {
    		return leftlength +1;
    	}
    	//else right add 1
    	else {
    		return rightlength +1;
    	}
    }

    public static<T> boolean isBalanced(BinaryTree<T> t){
        //TODO
    	if(t == null) {
    		return true;
    	}
    	//left height and right height abs is less equals than 1
        return Math.abs(height(t.left) - height(t.right)) <= 1
        		&& isBalanced(t.left)&& isBalanced(t.right);
    }

    public static <T> void preorder(BinaryTree<T> t){
		if (t!=null){
			System.out.printf("%-14s",t.getData());
			preorder(t.getLeft());
			preorder(t.getRight());
		}
	}

	public static <T> void inorder(BinaryTree<T> t){
		if (t!=null){
			inorder(t.getLeft());
			System.out.printf("%-14s",t.getData());
			inorder(t.getRight());
		}
	}

	public static <T> void postorder(BinaryTree<T> t){
		if (t!=null){
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.printf("%-14s", t.getData());
		}
	}

    public static <T> void levelorder(BinaryTree<T> t){
        //TODO
    	//store values to a queue
    	Queue<BinaryTree<T>> queue = new LinkedList<BinaryTree<T>>();
    	queue.add(t);
    	while (!queue.isEmpty()) {
    		//delete the first item and return it
    		BinaryTree<T> temp = queue.poll();
    		System.out.printf("%-14s",temp.data);
    		//follow the order that left to right
    		if(temp.left!=null) {
    			queue.add(temp.left);
    		}
    		if(temp.right!=null) {
    			queue.add(temp.right);
    		}
    	}
	}
}
