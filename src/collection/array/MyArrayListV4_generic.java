package collection.array;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyArrayListV4_generic<E> {

  /**
   * Object -> E 타입변경
   *    변경 x
   *    필드: Object[]
   *    생성자: Object
   */

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  // 생성자
  public MyArrayListV4_generic() {
    elementData = new Object[DEFAULT_CAPACITY];
  }
  public MyArrayListV4_generic(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size] = e;
    size++;
  }

  // 특정 인덱스에 값을 추가한다.
  public void add(int index, E e) {
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
  public E get(int index) {
    return (E) elementData[index];
  }

  // 해당 인덱스의 값 변경(변경되기 전 값 리턴)
  public E set(int index, E e) {
    E oldValue = get(index);
    elementData[index] = e;
    return oldValue;
  }

  public E remove(int index) {
    E oldValue = get(index);
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
  public int indexOf (E o) {
    return IntStream.range(0, size).filter(i -> o.equals(elementData[i])).findFirst().orElse(-1);
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
            size + ", capacity=" + elementData.length;
  }


}
