public class MyArrayList {
  private String[] items;
	private int capacity;
	private int numItems;

	public MyArrayList(int capacity) {
		this.capacity = capacity;
		items = new String[capacity];
		numItems = 0;
	}

  public String removeFirst() {
    String result = items[0];
    for (int i = 1; i < numItems; i++) {
      // copy each element one position to the left
      items[i-1] = items[i];
    }
    numItems -= 1;
    return result; 
  }

}