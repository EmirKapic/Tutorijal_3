package ba.unsa.etf.rpr;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{

    private String pozivniBroj;

    public MedunarodniBroj(String drzava, String broj){
        pozivniBroj = drzava + broj;
    }

    @Override
    public void ispisi() {
        System.out.println(pozivniBroj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pozivniBroj);
    }
}
