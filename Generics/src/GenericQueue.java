import java.util.ArrayList;

public class GenericQueue<T>{
    // declare all required fields
    private ArrayList<T> queue;
    private int size;
    private int cursor;
    /**
    Constructor 1
    No args.
    */
    public GenericQueue(){
        queue = new ArrayList<>();
        size = 0;
        cursor = 0;
    }

   //YOUR WORK STARTS HERE
    //method size return the size of the queue
    public int size() {
    	return queue.size();
    }
    //peek method return the first element of the queue
    public T peek() {
    	return queue.get(cursor);
    }
    //dequeue method return the element that removed
    public T dequeue() {
    	return queue.remove(cursor);
    }
    //add an element to the queue
    public void enqueue(T element) {
    	queue.add(element);
    }
    //if the queue is empty return true 
    public boolean isEmpty() {
    	return cursor == -1;
    }
    //remove all elements from the queue
    public void clear() {
    	for(int i=0;i<queue.size()-1;i++) {
    		queue.remove(i);
    	}
    }
    //identify the position of an element
    public int positionOf(T item) {
    	if(queue.isEmpty()==false) {
    		return queue.indexOf(item);
    	}
    	return queue.indexOf(item);
    }
    //remove an item from the queue
    public void remove(T item) {
    	queue.remove(item);
    }
    //return the first element
    public T first() {
    	if(queue.isEmpty()==false) {
    		return queue.get(0);
    	}else {
    		return null;
    	}
    }
    //return the next element
    public T next(T element) {
    	if(queue.indexOf(element)<queue.size()-1) {
    		return queue.get(queue.indexOf(element)+1);
    	}else {
    		return null;
    	}
    }
}
