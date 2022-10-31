package ba.unsa.etf.rpr;

/**
 * A list of cities which represent capital-city of their canton and their respective phone-number prefixes
 */
public enum Grad {
    Bihac("037"), Orasje("031"), Tuzla("035"), Zenica("032"), Goradze("038"),
    Travnik("030"), Mostar("036"), Siroki_Brijeg("039"), Sarajevo("033"), Livno("034");

    private String pozivniBroj;

    Grad(String broj){
        pozivniBroj = broj;
    }

    @Override
    public String toString() {
        return pozivniBroj;
    }
}
