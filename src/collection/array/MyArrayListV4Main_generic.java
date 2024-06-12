package collection.array;

import java.util.Arrays;

public class MyArrayListV4Main_generic {

  public static void main(String[] args) {

    MyArrayListV4_generic<String> stringList = new MyArrayListV4_generic<>();
    stringList.add("a");
    stringList.add("b");
    stringList.add("c");
    System.out.println(stringList);

    MyArrayListV4_generic<Integer> intList = new MyArrayListV4_generic<>();
    intList.add(1);
    intList.add(2);
    intList.add(3);
    System.out.println(intList);

  }

}
