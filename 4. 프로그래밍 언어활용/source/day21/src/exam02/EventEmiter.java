package exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EventEmiter {

    private Map<String, EventHandler> events = new HashMap<>();

    public void addListener(String event, EventHandler handler) {
        events.put(event, handler);
    }

    public void emit(String event) {
        EventHandler handler = events.get(event);
        if (handler != null) {
            handler.handler();
        }
    }
}
