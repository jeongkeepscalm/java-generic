package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

  public static void main(String[] args) {

    AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
    AnimalHospitalV1 catHospital = new AnimalHospitalV1();

    Dog dog1 = new Dog("dog1", 100);
    Cat cat1 = new Cat("cat1", 300);

    // 개 병원
    dogHospital.set(dog1);
    dogHospital.checkup();

    // 고양이 병원
    catHospital.set(cat1);
    catHospital.checkup();

    // 문제1: 개 병원에 고양이 전달
     dogHospital.set(cat1); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않음

    // 문제2: 개 타입 반환
    dogHospital.set(dog1);
    Dog biggerDog = (Dog) dogHospital.bigger(new Dog("dog2", 500));
    System.out.println("biggerDog = " + biggerDog);

    /**
     * 코드 재사용성 o
     *    다형성을 통해 AnimalHospitalV1 하나로 개와 고양이를 모두 처리
     * 타입 안정성 x
     *    개 병원에 고양이를 전달하는 문제 발생
     */

  }


}
