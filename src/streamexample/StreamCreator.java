package streamexample;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamCreator {

    public static void main(String[] args) {
        //         난수 생성
        IntStream ints = new Random().ints().limit(5);
        ints.forEach(System.out::println);
    }
}
