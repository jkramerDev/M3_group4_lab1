package tree;
import java.util.ArrayList;

public class GenericTreeNode<E> {
	E data;
	//<some list of children>
	ArrayList<GenericTreeNode<E>> children;
	
	public GenericTreeNode(E theItem) {
		data = theItem;
	}
	
	public void addChild(GenericTreeNode<E> theItem) {
		children.add(theItem);
	}
	
	public void removeChild(E theItem) {
		// this one is a little harder.
		// what do you do when the item has children?
		// I suggest "give them to the parent"
	}
	
	
} 
