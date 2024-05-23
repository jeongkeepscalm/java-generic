package generic.ex1;

public class BoxMain2 {
  public static void main(String[] args) {
    ObjectBox integerBox = new ObjectBox();
    integerBox.set(10);
    Integer integer = (Integer) integerBox.get();
    System.out.println("integer = " + integer);

    ObjectBox stringBox = new ObjectBox();
    stringBox.set("hello");
    String string = (String) stringBox.get();
    System.out.println("string = " + string);

    // 잘못된 타입의 인수를 전달할 경우: ClassCastException 발생
    integerBox.set("java");
    Integer result = (Integer) integerBox.get();
    System.out.println("result = " + result);

  }

}
