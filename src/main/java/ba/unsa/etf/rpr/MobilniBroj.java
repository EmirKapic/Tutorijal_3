package ba.unsa.etf.rpr;

import java.util.Objects;

/**
 * User's mobile number
 * Constructor takes an integer in the interval [60-67] which represents the mobile network and a string which represents the rest of the number
 * Throws WrongNumberException if the mobile network isn't in the allowed interval
 */

public class MobilniBroj extends TelefonskiBroj{
    private String mobilniBroj;

    /**
     * Construct the mobile number
     * @param mobilnaMreza
     * @param broj
     * @throws WrongNumberException
     */
    public MobilniBroj(int mobilnaMreza, String broj) throws WrongNumberException{
        if (mobilnaMreza > 67 || mobilnaMreza < 60)throw new WrongNumberException("Neispravan pozivni!");
        mobilniBroj = "0" + String.valueOf(mobilnaMreza) + "/" + broj;
    }

    /**
     * Prints the number in the format "xxx/xxx-xxx"
     */
    @Override
    public void ispisi() {
        System.out.println(mobilniBroj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilniBroj that = (MobilniBroj) o;
        return mobilniBroj.equals(that.mobilniBroj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilniBroj);
    }
}
