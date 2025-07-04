import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vladislav117.events.EventSystem;

public final class EventSystemTests {
    @Test
    public void test() {
        EventSystem<Object> eventSystem = new EventSystem<>();

        eventSystem.addHandler(Integer.class, event -> {
            Assertions.assertEquals(1, event);
        });

        eventSystem.addHandler(String.class, event -> {
            Assertions.assertEquals("test", event);
        });

        eventSystem.handle("test");

        eventSystem.handle(1);
    }
}
