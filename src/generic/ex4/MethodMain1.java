package generic.ex4;

public class MethodMain1 {
  public static void main(String[] args) {
    Integer i = 10;
    Object o = GenericMethod.objMethod(1);

    // Generic Method
    Integer i1 = GenericMethod.<Integer>genericMethod(i);
    Integer i2 = GenericMethod.<Integer>numberMethod(30);
    Double d = GenericMethod.<Double>numberMethod(3.6);

    // 컴파일러가 타입추론하여 생략 가능
    Integer i3 = GenericMethod.genericMethod(i);
    Integer i4 = GenericMethod.numberMethod(30);
    Double d1 = GenericMethod.numberMethod(3.6);

  }

}
