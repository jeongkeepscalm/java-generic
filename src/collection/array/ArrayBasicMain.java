package collection.array;

import java.util.Arrays;

public class ArrayBasicMain {
  public static void main(String[] args) {

    int[] arr = new int[5];

    // index 입력: O(1)
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    System.out.println(arr);                    // 참조 주소값
    System.out.println(Arrays.toString(arr));   // [1,2,3,0,0]

    // index 변경: O(1)
    arr[2] = 10;
    System.out.println(Arrays.toString(arr));   // [1,2,10,0,0]

    // index 조회: O(1)
    System.out.println("arr[2] = " + arr[2]);   // 10

    // 검색: O(n)
    int intToFind = 10;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == intToFind) {
        System.out.println(intToFind + "찾음");
        break;
      }
    }

    // Arrays.copyOf(기존배열, 새로운길이): 새로운 길이로 배열을 생성하고, 기존 배열의 값을 새로운 배열에 복사한다
    System.out.println("new array: " + Arrays.toString(Arrays.copyOf(arr, arr.length * 2)));

  }

}
