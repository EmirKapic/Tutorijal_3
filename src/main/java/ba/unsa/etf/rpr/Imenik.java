package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


/**
 * Keeps track of people and their phone number
 */
public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik;

    public Imenik(){
        imenik = new HashMap<>();
    }

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }

    /**
     * Returns the phone number that belongs to the person passed as parameter, otherwise throws exception if it
     * doesn't exist.
     * @param ime
     * @return phone number
     * @throws EntryNotFoundException
     */
    String dajBroj(String ime) throws EntryNotFoundException {
        if (imenik.containsKey(ime)){
            return imenik.get(ime).toString();
        }
        else{
            throw new EntryNotFoundException("Trazeni kljuc ne postoji");
        }
    }

    /**
     * Returns the name of the person whose phone number was passed as parameter, otherwise throws exception
     * if it doesn't exist.
     * @param broj
     * @return name
     * @throws EntryNotFoundException
     */
    public String dajIme(TelefonskiBroj broj) throws EntryNotFoundException {
        if (imenik.containsValue(broj)){
            for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
                if (entry.getValue().equals(broj))return entry.getKey();
        }
        else{
            throw new EntryNotFoundException("Trazeni kljuc ne postoji");
        }
        return null;
    }

    /**
     * Returns all numbers that belong to a person whose name begins with an 'S'
     * @param s
     * @return
     */
    String naSlovo(char s){
        String result = "";
        for (Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet())
                if (entry.getKey().charAt(0) == 'S')
                    result += entry.getKey().toString() + " - " + entry.getValue().toString() + "\n";
        return result;
    }

    /**
     * returns a set of names of all people that live in the city passed as parameter
     * @param g
     * @return set of strings
     */
    Set<String> izGrada(Grad g){
        TreeSet<String> imena = new TreeSet<>();
        for (Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            String temp = entry.getValue().toString();
            if (temp.startsWith(g.toString()))imena.add(entry.getKey());
        }
        return imena;
    }

}
