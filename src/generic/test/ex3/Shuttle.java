package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {


  private T value;

  public void in(T t) {
    value = t;
  }

  public T out() {
    return value;
  }

  public void showInfo() {
    System.out.println(value.toString());
  }

}
