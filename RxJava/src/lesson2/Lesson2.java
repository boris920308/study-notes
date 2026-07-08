package lesson2;

import io.reactivex.rxjava3.core.Observable;

public class Lesson2 {

    public static void main(String[] args) {
        example2();
    }

    private static void onErrorTest() {
        Observable<Integer> onErrorTest = Observable.create(emitter -> {
            emitter.onNext(1);
            emitter.onNext(2);

            emitter.onError(new RuntimeException());

            emitter.onNext(3);
        });

        onErrorTest.subscribe(
                System.out::println,
                error -> System.out.println("error!")
        );
    }

    private static void example1() {
        Observable.just(10, 20, 30)
                .subscribe(
                        value -> System.out.println("받은 값: " + value),
                        error -> System.out.println("에러 발생"),
                        () -> System.out.println("모든 데이터 수신 완료")
                );
    }

    private static void example2() {
        Observable.create(emitter -> {
            emitter.onNext("A");
            emitter.onComplete();
            emitter.onNext("B");
            emitter.onError(new RuntimeException("Error"));
        }).subscribe(
                System.out::println,
                e -> System.out.println("Error"),
                () -> System.out.println("Complete")
        );
    }
}
