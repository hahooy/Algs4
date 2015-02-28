public class Deque<Item> implements Iterable<Item> {
    private int N; //size of the deque
    private Node<Item> first; //first node of the deque
    private Node<Item> last; //last node of the Deque

    // construct an empty deque
    public Deque() {
	first = null;
	last = null;
	N = 0;
    }

    // linked list inner class
    public class Node<Item> {
	private Item item;
	private Node<Item> next;
    }

    // is the deque empty?
    public boolean isEmpty() {
	return N == 0;
    }

    // return the number of items on the deque
    public int size() {
	return N;
    }

    // add the item to the front
    public void addFirst(Item item) {
	Node<Item> oldFirst = first;
	first = new Node<Item>();
	first.item = item;
	first.next = oldFirst;
	N++;
    }

    // add the item to the end
    public void addLast(Item item) {
	Node<Item> oldLast = last;
	last = new Node<Item>;
	last.item = item;
	last.next = null;
	oldLast.next = last;
	N++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
	Item item = first.item;
	first = first.next;
	N--;
	return item;
    }

    // remove and return the item from the end
    public Item removeLast() {
	Item item = last.item;
	last
	    N--;
	return item;
    }

    // return an iterator over items in order from front to end
    public Iterator<Item> iterator() {}

    // unit testing
    public static void main(String[] args) {}
}

	
