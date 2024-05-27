package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

  public static void main(String[] args) {

    Dog dog = new Dog("dog1", 100);
    Cat cat = new Cat("cat1", 200);

    /**
     * 타입 매개변수 추론으로 생략 가능
     */
    AnimalMethod.checkup(dog);
    AnimalMethod.checkup(cat);
    // AnimalMethod.<Dog>checkup(dog);
    // AnimalMethod.<Cat>checkup(cat);

    Dog targetDog = new Dog("targetDog", 150);
    Dog biggerOne = AnimalMethod.bigger(targetDog, dog);
    // Dog biggerOne = AnimalMethod.<Dog>bigger(targetDog, dog);
    System.out.println("biggerOne = " + biggerOne);

  }

}
