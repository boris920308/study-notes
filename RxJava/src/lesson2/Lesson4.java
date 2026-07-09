package lesson2;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class Lesson4 {
    public static void main(String[] args) {
        mission();
    }

    private static void example1() {
        Observable.just(1, 2, 3, 4, 5)
                .map(n -> n * 2)
                .filter(n -> n > 5)
                .subscribe(System.out::println);
    }

    private static void example2() {
        Observable.just("A", "A", "B", "B", "A")
                .distinct()
                .subscribe(System.out::println);
    }

    private static void example3() {
        Observable.just("A", "A", "B", "B", "A")
                .distinctUntilChanged()
                .subscribe(System.out::println);
    }

    private static void example4() {
        Observable.just(1, 2, 3, 4, 5)
                .skip(1)
                .take(3)
                .subscribe(System.out::println);
    }

    private static void example5() {
        Observable.just(1, 2, 3, 4)
                .reduce(0, (sum, n) -> sum + n)
                .subscribe(System.out::println);
    }

    private static void mission() {
        //1. 리스트를 Observable로 변환한다.
        //2. 짝수만 통과시킨다.
        //3. 각 숫자에 100을 곱한다.
        //4. 앞에서 3개만 출력한다.

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Observable.fromIterable(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 100)
                .take(3)
                .subscribe(System.out::println);
    }
}
