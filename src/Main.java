class Main {
	
	// Warmup Day 4
//	  Node n1 = new Node("A");
//	  Node n2 = new Node("B");
//	  Node n3 = new Node("C", n1);
//	  n1.next = n2;
//	  Node head = n3;
//	  show(head);
//	  n3.next = n2; // remove the "A" node
//	  show(head);
//	  head = head.next; // remove "C" node
//	  show(head);
//	  

  static public int find(String[] items, String target) {

    // loop through entire array
    for (int i = 0; i < items.length; i++) {
      if (items[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  static public int count(String[] items, String target) {
    int matches = 0; // running total
    // loop through entire array (range-based for loop)
    for (String s : items) {
      if (s.equals(target)) {
        matches += 1;
      }
    }
    return matches;
  }

  static public void show(String[] items) {
    for (String s : items) {
      System.out.print(s + " ");
    }
    System.out.println();
  }

  static public String removeFirst(String[] items) {
    String result = items[0];
    for (int i = 1; i < items.length; i++) {
      // copy each element one position to the left
      items[i-1] = items[i];
    }
    return result;  
  }

  static public void show(Node head) {
    Node current = head;

    while (current != null) {
      // access the current node
      System.out.print(current.element  + " ");
      // update current to advance to the next node
      current = current.next;
    }
    System.out.println();
  }

  // Question 6
  static public Node insertBefore(Node head, String item, String target) {
	  // make the new node
	  Node injection = new Node(item);
	  
	  // special case: no list!
	  if (head == null)
		  return head;
	  
	  // special case: need to insert at front
	  if (target.equals(head.element)) {
		  injection.next = head;
		  head = injection;
	  }
	  
	  
	  
	  return head;
  }
  
  public static void main(String[] args) {
    // String[] things = { "tree", "fish", "car", "mouse", "pen" };
    // show(things);
    // String removed = removeFirst(things);
    // System.out.println("Removed: " + removed);
    // show(things);
	  
	// Linked List exercises

    Node a = new Node("apple");
    Node b = new Node("banana");
    Node c = new Node("cherry");
    Node head;
    
    // Question 1
    head = a;  // make head refer to the same node a refers to
    a.next = b; // make a.next refer to the same node b refers to
    b.next = c; // make b.next refer to the same node c refer to

    // Question 2
    show(head);

    // Question 3
    // create a new node
    Node newnode = new Node("blueberry");
    // link blueberry's next to cherry
    newnode.next = c;
    // link banana's next to the new node
    b.next = newnode;
    show(head);
    
    // Question 4
    // change the next of the "apple" node to point to the "blueberry" node
    a.next = a.next.next;
    show(head);
    
    // Question 5
    // create a new node, with its next pointing to the "apple" node
    Node first = new Node("first!", a);
    // make head point to the new node
    head = first;
    // ** The two lines above can be done in one line:
    // head = new Node("first!", a);
    show(head);
    
    // Question 6
    head = insertBefore(head, "haha!", "first!");
    show(head);
	  
  }

  

}