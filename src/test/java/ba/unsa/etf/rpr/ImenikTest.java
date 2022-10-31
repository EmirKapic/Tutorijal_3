package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;



class ImenikTest {

    Imenik i;
    @BeforeEach
    void Postavi(){
        String a,m;
        Grad g = Grad.Goradze;
        FiksniBroj al = new FiksniBroj(g, "243-3333");
        FiksniBroj mr = new FiksniBroj(g, "005-1111");
        FiksniBroj e = new FiksniBroj(Grad.Bihac, "553-2414");
        a = "Alem"; m = "Meriha";
        i = new Imenik();

        i.dodaj(a,al);
        i.dodaj(m,mr);
        i.dodaj("Emir", e);
    }



    @Test
    void dajBrojTest() throws EntryNotFoundException {
        assertEquals("038/243-3333", i.dajBroj("Alem"));
    }

    @Test
    void izGrada() {
        TreeSet<String> trazeno = new TreeSet<>();
        trazeno.add("Alem"); trazeno.add("Meriha");
        assertEquals(trazeno, i.izGrada(Grad.Goradze));
    }
}