package collection.link;

public class MyLinkedListV3 <E> {

  private Node<E> first; // List 역할
  private int size = 0;

  public void add(E e) {
    Node<E> newNode = new Node(e);
    if (first == null) {
      first = newNode;
    } else {
      Node lastNode = getLastNode();
      lastNode.next = newNode;
    }
    size++;
  }

  // 추가된 코드
  public void add(int index, E e) {
    Node<E> newNode = new Node<>(e);
    if (index == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      Node<E> prev = getNode(index - 1);
      newNode.next = prev.next;
      prev.next = newNode;
    }
    size++;
  }

  // 추가된 코드
  public E remove(int index) {

    Node<E> nodeToRemove = getNode(index);
    E removedItem = nodeToRemove.item;

    if (index == 0) {
      first = nodeToRemove.next;
    } else {
      Node<E> previousNode = getNode(index-1);
      previousNode.next = nodeToRemove.next;
    }

    nodeToRemove.item = null;
    nodeToRemove.next = null;
    size--;

    return removedItem;
  }

  private Node<E> getLastNode() {
    Node<E> x = first;
    while (x.next != null) {
      x = x.next;
    }
    return x;
  }

  public E set(int index, E element) {
    Node<E> x = getNode(index);
    E oldItem = x.item;
    x.item = element;
    return oldItem;
  }

  public E get(int index) {
    Node<E> node = getNode(index);
    return node.item;
  }

  public Node<E> getNode(int index) {
    Node<E> x = first;
    for (int i = 0; i < index; i++) {
      x = x.next;
    }
    return x;
  }

  public int indexOf(E o) {
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

  private static class Node<E> {

    E item;
    Node<E> next;

    public Node(E item) {
      this.item = item;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      Node<E> temp = this;
      sb.append("[");
      while (temp != null) {
        sb.append(temp.item);
        if (temp.next != null) {
          sb.append("->");
        }
        temp = temp.next;
      }
      sb.append("]");
      return sb.toString();
    }

  }

}
