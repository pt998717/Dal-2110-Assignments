import java.util.ArrayList;

/**
 * basic stack example
 * References: https://en.wikipedia.org/wiki/Stack_(abstract_data_type), Class notes
 * @param <T>
 */
public class GenericStack<T> {
    private ArrayList<T> storage;
    private int top;
    public GenericStack(){

        storage = new ArrayList<T>();
    }

    //YOUR WORK STARTS HERE
    //size method to get the stack size 
    public int size() {
    	return storage.size();
    }
    //peek method to get the first number
    public T peek() {
    	return storage.get(top);
    }
    //pop method return the element that removed from the stack
    public T pop() {
    	return storage.remove(--top);
    }
    //push method to add an item in the stack
    public void push(T element) {
    	storage.add(top++, element);
    }
    //isEmpty return true if it is empty
    public boolean isEmpty() {
    	return top == -1;
    }
}
