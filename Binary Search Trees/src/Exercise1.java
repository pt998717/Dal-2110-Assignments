/**
Expands upon a framework provided by Srini (Dr. Srini Sampalli). Used from previous version for 2020.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args){

	    //ToDo
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		//initialize the binary search tree called bst
		Scanner kb = new Scanner (System.in);
		int input = -1;
		while(input!=0) {
			System.out.print("Enter int or '0': ");
			input = kb.nextInt();
			if(input!=0) {
				bst.insert(input);
				//read the values and insert into the bst
			}
		}
		System.out.println();
		System.out.println("The max data value in the BST is: "+bst.findMax());
		//call the findMax method
		System.out.println("The min data value in the BST is: "+bst.findMin());
		//call the findMin method
		System.out.println();
		System.out.println("What key would you like to search for?");
		System.out.print("[INT KEY]>>>");
		input = kb.nextInt();
		kb.close();
		if(bst.recursiveSearch(input)!=null) {
			//call the recursiveSecrch method if return is not null then found
			System.out.println("Found!");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("And is it a true BST...Yes!");
		}else {
			//else not found
			System.out.println("The element is not exist");
		}
    }



    // the isBinarySearchTree method returns true if the tree passed (and
    // all subtrees) meet the criteria to be considered BSTs
    // use this code to verify your tree is a BST
    public static<T extends Comparable<T>> boolean isBinarySearchTree(BinaryTree<T> t){
        // base case
        if(t==null||t.isEmpty())
            return true;
            // recursive case
        else{
            boolean bst = true;
            T val = t.getData();

            // test left subtree data to ensure they are all less than val
            if(t.getLeft()!=null){
                BinaryTree<T> lt = t.getLeft();
                Queue<BinaryTree<T>> q = new LinkedList<BinaryTree<T>>();
                q.add(lt);

                while(!q.isEmpty()){
                    BinaryTree<T> r = q.poll();
                    if(val.compareTo(r.getData())<0){
                        bst = false;
                        break;
                    }
                    if(r.getLeft()!=null)
                        q.add(r.getLeft());
                    if(r.getRight()!=null)
                        q.add(r.getRight());
                }
            }

            // test right subtree data to ensure they are all greater than val
            if(t.getRight()!=null&&bst){
                BinaryTree<T> rt = t.getRight();
                Queue<BinaryTree<T>> q = new LinkedList<BinaryTree<T>>();
                q.add(rt);

                while(!q.isEmpty()){
                    BinaryTree<T> r = q.poll();
                    if(val.compareTo(r.getData())>0){
                        bst = false;
                        break;
                    }
                    if(r.getLeft()!=null)
                        q.add(r.getLeft());
                    if(r.getRight()!=null)
                        q.add(r.getRight());
                }
            }
            return bst&&isBinarySearchTree(t.getLeft())&&
                    isBinarySearchTree(t.getRight());
        }
    }




}
