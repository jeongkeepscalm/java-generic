package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

  public static void main(String[] args) {
    AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
    AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
    AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
    AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();

    // 문제: 제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 다 들어올 수 있다.
  }

}
