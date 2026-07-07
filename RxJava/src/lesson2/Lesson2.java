package lesson2;

import io.reactivex.rxjava3.core.Observable;

public class Lesson2 {

    public static void main(String[] args) {
        onErrorTest();
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
}
