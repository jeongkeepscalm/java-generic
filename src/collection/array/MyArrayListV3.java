package collection.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyArrayListV3 {

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  // 생성자
  public MyArrayListV3() {
    elementData = new Object[DEFAULT_CAPACITY];
  }
  public MyArrayListV3(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size] = e;
    size++;
  }

  // 특정 인덱스에 값을 추가한다.
  public void add(int index, Object e) {
    if (elementData.length == size) {
      grow();
    }
    getShiftRightFrom(index);
    elementData[size] = e;
    size++;
  }

  // 배열의 길이를 2배로 늘린다.
  public void grow() {
    elementData = Arrays.copyOf(elementData, elementData.length * 2);
  }

  // 해당 인덱스부터 값을 한 칸씩 오른쪽으로 옮김
  public void getShiftRightFrom(int index) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
  }

  // 인덱스에 해당되는 값을 리턴
  public Object get(int index) {
    return elementData[index];
  }

  // 해당 인덱스의 값 변경(변경되기 전 값 리턴)
  public Object set(int index, Object e) {
    Object oldValue = get(index);
    elementData[index] = e;
    return oldValue;
  }

  public Object remove(int index) {
    Object oldValue = get(index);
    shiftLeftFrom(index);
    size--;
    elementData[size] = null;
    return oldValue;
  }

  // 해당 인덱스까지 들어있는 값들을 왼쪽으로 옮김
  public void shiftLeftFrom(int index) {
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
  }

  // 인덱스 반환
  public int indexOf(Object o) {
    /*
      for (int i = 0; i < size; i++) {
        if (o.equals(elementData[i])) {
          return i;
        }
      }
      return -1;
    */
    return IntStream.range(0, size).filter(i -> o.equals(elementData[i])).findFirst().orElse(-1);
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
            size + ", capacity=" + elementData.length;
  }

}
