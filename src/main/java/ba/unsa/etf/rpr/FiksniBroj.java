package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private String fiksniBroj;

    FiksniBroj(Grad grad, String broj){
        fiksniBroj = grad + "/" + broj;
    }

    @Override
    public void ispisi(){
        System.out.println(fiksniBroj);
    }

    @Override
    public String toString() {
        return fiksniBroj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return that.fiksniBroj.equals(fiksniBroj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fiksniBroj);
    }
}
