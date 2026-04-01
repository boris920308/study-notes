package singleton;

public class Settings {

    private static volatile Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            // instance가 없는 경우에만 synchronized 블럭을 타게 되므로 비용적으로 이득이 있다.
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }

        return instance;
    }
}
