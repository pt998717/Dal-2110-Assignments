import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		//create a queue called trees
		Queue<String> trees = new LinkedList<String>();
		Scanner kb = new Scanner (System.in);
		String input = "";
		//scan in all inputs and add them to trees
		while(!input.equals("done")) {
			System.out.print("Enter name or done: ");
			input = kb.next();
			trees.add(input);
		}
		kb.close();
		//create another queue called agenda
		Queue<String> agenda = new LinkedList<String>();
		
		//create five nodes just like demo
		BinaryTree<String> A = new BinaryTree<String>();
		BinaryTree<String> B = new BinaryTree<String>();
		BinaryTree<String> C = new BinaryTree<String>();
		BinaryTree<String> D = new BinaryTree<String>();
		BinaryTree<String> E = new BinaryTree<String>();
		//remove the front item and set it to trueroot
		String trueroot = trees.remove();
		//add it to agenda
		agenda.add(trueroot);
		//make root for this item and remove it from agenda
		A.makeRoot(agenda.remove());
		
		if(!trees.isEmpty()) {
			//keep removing items from trees and make root for it
			trueroot = trees.remove();
			agenda.add(trueroot);
			B.makeRoot(agenda.remove());
			//attach left this item to A
			A.attachLeft(B);
		}
		
		if(!trees.isEmpty()) {
			//keep removing items from trees and make root for it
			trueroot = trees.remove();
			agenda.add(trueroot);
			C.makeRoot(agenda.remove());
			//attach right this item to A
			A.attachRight(C);
		}
		
		if(!trees.isEmpty()) {
			//keep removing items from trees and make root for it
			trueroot = trees.remove();
			agenda.add(trueroot);
			D.makeRoot(agenda.remove());
			//attach left this item to B
			B.attachLeft(D);
		}
		
		if(!trees.isEmpty()) {
			//keep removing items from trees and make root for it
			trueroot = trees.remove();
			agenda.add(trueroot);
			E.makeRoot(agenda.remove());
			//attach right this item to B
			B.attachRight(E);
		}
		//print the height
		System.out.printf("Height of the tree is: %d\n",
                BinaryTree.height(A));
		//print the nodes number
		System.out.printf("Number of nodes in the tree is: %d\n",
                BinaryTree.nodes(A));

		System.out.println();
		//Inorder method
		System.out.print("Inorder:\t");
		BinaryTree.inorder(A);
		System.out.println();
		//Preorder method
		System.out.print("Preorder:\t");
		BinaryTree.preorder(A);
		System.out.println();
		//postorder method
		System.out.print("Postorder:\t");
		BinaryTree.postorder(A);
		System.out.println();
		//levelorder method
		System.out.print("Level order:\t");
		BinaryTree.levelorder(A);
		System.out.println();
		System.out.println();


	}
}
