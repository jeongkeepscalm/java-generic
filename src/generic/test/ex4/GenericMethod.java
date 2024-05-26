package generic.test.ex4;

public class GenericMethod {

  public static Object objMethod(Object obj) {
    System.out.println("Object print: " + obj);
    return obj;
  }

  /**
   * Generic Method: 반환타입에 타입매개변수를 설정하여 지정한다.
   */
  public static <T> T genericMethod(T t) {
    System.out.println("Generic print: " + t);
    return t;
  }

  public static <T extends Number> T numberMethod(T t) {
    System.out.println("bound print: " + t);
    return t;
  }

}
