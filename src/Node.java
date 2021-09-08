public class Node {
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