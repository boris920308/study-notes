package lesson2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

public class Lesson2 {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable
                .just(1, 2, 3);


        Disposable disposable = observable.subscribe(
                value -> {
                    System.out.println("value = " + value);
                }
        );

        disposable.dispose();
    }
}
