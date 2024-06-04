package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
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


  }

}
