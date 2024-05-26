package generic.test.ex5;

import generic.animal.Animal;

public class WildcardEx {
  static <T> void printGenericV1(Box<T> box) { // Box 라는 제네릭 타입을 받는다.
    System.out.println("T = "+ box.get());
  }
  static void printWildcardV1(Box<?> box) { // wildcard 변환
    System.out.println("? = "+ box.get());
  }

  static <T extends Animal> void printGenericV2(Box<T> box) { // Box 라는 제네릭 타입을 받지만 Animal 이 들어있는 박스
    T t = box.get();
    System.out.println("동물 이름: " + t.getName());
  }
  static void printWildcardV2(Box<? extends Animal> box) { // wildcard 변환
    Animal animal = box.get();
    System.out.println("동물 이름: " + animal.getName());
  }

  static <T extends Animal> T printAndReturnGeneric(Box<T> box) { // 동물이름 출력 후 반환
    T t = box.get();
    System.out.println("동물 이름: " + t.getName());
    return t;
  }
  static Animal printAndReturnWildcard(Box<? extends Animal> box) { // wildcard 변환
    Animal animal = box.get();
    System.out.println("동물 이름: " + animal.getName());
    return animal;
  }

}
