package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

  public static void main(String[] args) {

    DogHospital dogHospital = new DogHospital();
    CatHospital catHospital = new CatHospital();

    Dog dog1 = new Dog("dog1", 100);
    Cat cat1 = new Cat("cat1", 300);

    // 개 병원
    dogHospital.set(dog1);
    dogHospital.checkup();

    // 고양이 병원
    catHospital.set(cat1);
    catHospital.checkup();

    // 문제1: 개 병원에 고양이 전달
    // dogHospital.set(cat1); // 다른 타입 입력: 컴파일 오류

    // 문제2: 개 타입 반환
    dogHospital.set(dog1);
    Dog biggerDog = dogHospital.bigger(new Dog("dog2", 500));
    System.out.println("biggerDog = " + biggerDog);


  }


}
