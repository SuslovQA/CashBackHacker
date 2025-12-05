import org.example.service.CashbackHackService;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateAtZero() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAt1() {
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAt999() {
        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAt1000() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAt1001() {
        int actual = service.remain(1001);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
