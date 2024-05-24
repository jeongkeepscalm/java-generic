package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

  public static void main(String[] args) {

    AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
    AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

    Dog dog1 = new Dog("dog1", 100);
    Cat cat1 = new Cat("cat1", 300);

    // 개 병원
    dogHospital.set(dog1);
    dogHospital.checkup();

    // 고양이 병원
    catHospital.set(cat1);
    catHospital.checkup();

    // 문제1: 개 병원에 고양이 전달
     // dogHospital.set(cat1); // 타입 제한

    // 문제2: 개 타입 반환
    dogHospital.set(dog1);
    Dog biggerDog = dogHospital.bigger(new Dog("dog2", 500));
    System.out.println("biggerDog = " + biggerDog);

    /**
     * 코드 재사용성 o
     *    다형성을 통해 AnimalHospitalV3 하나로 개와 고양이를 모두 처리
     * 타입 안정성 o
     *    개 병원에 고양이를 전달하는 문제 해결
     */

  }

}
