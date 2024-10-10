package collection.set;

public class HashMain_String {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        // 모든 문자는 고유한 숫자로 표현이 가능하다. 

        // ASCII 코드 변환
        char charA = 'A';
        char charB = 'B';

        System.out.println("(int) charA = " + (int) charA);
        System.out.println("(int) charB = " + (int) charB);

        // hashCode
        int hashCode_abc = hashCode("A");
        System.out.println("hashCode_abc = " + hashCode_abc);


        // hashIndex
        System.out.println("hashIndex(hashcode(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashcode(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashcode(AB) = " + hashIndex(hashCode("AB")));

    }

    // get hashCode
    static int hashCode(String str) {
        return str.chars().sum();
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

}
