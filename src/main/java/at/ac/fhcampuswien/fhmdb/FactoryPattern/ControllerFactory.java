package at.ac.fhcampuswien.fhmdb.FactoryPattern;

import javafx.util.Callback;

import java.util.HashMap;
import java.util.Map;

public class ControllerFactory implements Callback<Class<?>, Object> {
    public static ControllerFactory instance;
    private final Map<Class<?>, Object> cache = new HashMap<>();

    private ControllerFactory() {
    }
    public static synchronized ControllerFactory getInstance() {
        if (instance == null) {
            instance = new ControllerFactory();
        }
        return instance;
    }
    @Override
    public Object call (Class<?> type) {
        return cache.computeIfAbsent(type, k -> {
            try {
                return type.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });

    }
}
