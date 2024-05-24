package generic.ex1;

public class BoxMain3 {

  public static void main(String[] args) {

    /**
     * 생성 시점에 T의 타입이 결정된다.
     */
    GenericBox<Integer> integerBox = new GenericBox<Integer>();
    integerBox.set(10);
    // integerBox.set("hello"); // Integer 타입만 허용, 컴파일 오류
    Integer integer = integerBox.get();
    System.out.println("integer = " + integer);

    // 타입 추론: 생성하는 제네릭 타입 생략 가능
    GenericBox<String> stringBox = new GenericBox<>();
    stringBox.set("genericString");
    String str = stringBox.get();
    System.out.println("str = " + str);
  }

}
