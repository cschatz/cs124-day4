public class MyLinkedList {
  private class Node {
		String element;
		Node next;
		
		public Node(String element, Node next) {
			this.element = element;
			this.next = next;
		}
		
		public Node(String element) {
			this(element, null);
		}
	}
	
	private Node head;
	private Node tail;
	private int numItems;
	
	public MyLinkedList() {
		head = null;
		tail = null;
		numItems = 0;
	}
}