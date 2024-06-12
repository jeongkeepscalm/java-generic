package collection.link;

public class MyLinkedListV1 {

  private Node first; // List 역할
  private int size = 0;

  public void add(Object e) {
    Node newNode = new Node(e);
    if (first == null) {
      first = newNode;
    } else {
      Node lastNode = getLastNode();
      lastNode.next = newNode;
    }
    size++;
  }

  private Node getLastNode() {
    Node x = first;
    while (x.next != null) {
      x = x.next;
    }
    return x;
  }

  public Object set(int index, Object element) {
    Node x = getNode(index);
    Object oldItem = x.item;
    x.item = element;
    return oldItem;
  }

  public Object get(int index) {
    Node node = getNode(index);
    return node.item;
  }

  public Node getNode(int index) {
    Node x = first;
    for (int i = 0; i < index; i++) {
      x = x.next;
    }
    return x;
  }

  public int indexOf(Object o) {
    int index = 0;
    for (Node i = first; i.next != null; i = i.next) {
      if (o.equals(i.item)) {
        return index;
      }
      index++;
    }
    return -1;
  }

  public int size() {
    return size;
  }
  @Override
  public String toString() {
    return "MyLinkedListV1{" +
            "first=" + first +
            ", size=" + size +
            '}';
  }

}
