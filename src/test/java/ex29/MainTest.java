package ex29;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {
    @Test
    void shouldgetYearsWhenRateIs4() {
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.Model res = ex29.Main.getYears();
        assertEquals(18, res.year);
    }

    @Test
    void shouldgetYearsWhenRateIs5() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.Model res = ex29.Main.getYears();
        assertEquals(14, res.year);
    }
}