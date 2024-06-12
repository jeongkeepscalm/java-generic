package collection.link;

public class NodeMain2 {

  public static void main(String[] args) {

    Node first = new Node("A");
    first.next =  new Node("B");
    first.next.next = new Node("C");
    first.next.next.next = new Node("D");

    System.out.println(first);

  }

}
