package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

  /**
   * 타입 매개변수 제한
   * <T extends Animal> {}: Animal 과 하위 타입만 받는다.
   * 타임 매개변수에 입력될 수 있는 값의 범위 예측이 가능하다. 
   */

  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  public void checkup() {
     System.out.println("동물 이름: " + animal.getName());
     System.out.println("동물 크기: " + animal.getSize());
     animal.sound();
  }

  // 큰 동물을 반환
  public T bigger(T target) {
     return animal.getSize() > target.getSize() ? animal : target;
  }
}
