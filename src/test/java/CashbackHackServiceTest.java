import org.junit.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmountIs900() {
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmountIs1500() {
        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn200IfAmountIs1800() {
        int amount = 1800;
        int expected = 200;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}

