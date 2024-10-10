package collection.set_java.test;

import java.util.HashSet;

public class RectangleTest {

    public static void main(String[] args) {

        HashSet<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20)); // 중복

        for (Rectangle rectangle : rectangleSet) {
            System.out.println("rectangle = " + rectangle);
        }

        /*
            before overriding equals & hashCode
                rectangle = Rectangle{width=20, height=20}
                rectangle = Rectangle{width=10, height=10}
                rectangle = Rectangle{width=20, height=20}

            after overriding equals & hashCode
                rectangle = Rectangle{width=10, height=10}
                rectangle = Rectangle{width=20, height=20}
         */

    }

}
