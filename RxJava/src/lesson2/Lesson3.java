package lesson2;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        example3();
    }


    private static void example1() {
        List<String> list = List.of("Java", "RxJava");

        Observable.just(list)
                .subscribe(System.out::println);
    }

    private static void example2() {
        List<String> list = List.of("Java", "RxJava");

        Observable.fromIterable(list)
                .subscribe(System.out::println);
    }

    private static void example3() {
        Observable.create(emitter -> {
                    emitter.onNext(100);
                    emitter.onNext(200);
                    emitter.onComplete();
                })
                .subscribe(
                        System.out::println,
                        Throwable::printStackTrace,
                        () -> System.out.println("Done")
                );
    }
}
