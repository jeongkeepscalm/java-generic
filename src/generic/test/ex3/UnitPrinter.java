package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

  public static <T extends BioUnit> void printV1(Shuttle<T> t) {
    System.out.println(t.out().toString());
  }

  public static void printV2(Shuttle<? extends BioUnit> v) {
    System.out.println(v.out().toString());
  }
}
