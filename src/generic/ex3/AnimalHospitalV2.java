package generic.ex3;

public class AnimalHospitalV2<T> {

  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  public void checkup() {
    // 컴파일 오류: 클래스 내 해당 메소드 정의시 T 타입을 알 수 없다. Object 의 기능만 사용 가능  
    // System.out.println("동물 이름: " + animal.getName());
    // System.out.println("동물 크기: " + animal.getSize());
    // animal.sound();
  }

  // 큰 동물을 반환
  public T bigger(T target) {
    // 컴파일 오류
    // return animal.getSize() > target.getSize() ? animal : target;
    return null;
  }
}
