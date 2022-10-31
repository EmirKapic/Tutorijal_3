package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilniBrojTest {

    @Test
    void testConstructor() {
        assertThrows(WrongNumberException.class, () -> new MobilniBroj(59,"41342424"));
    }

    @Test
    void testEquals() throws WrongNumberException {
        MobilniBroj broj = new MobilniBroj(60,"533-6433");
        MobilniBroj broj2 = new MobilniBroj(60,"533-6433");
        assertTrue(broj.equals(broj2));
    }
}