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
     * @param ime of the person we're looking for
     * @return phone number
     * @throws EntryNotFoundException if the name doesn't exist in the phonebook
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
     * @param broj number of the person we're looking for
     * @return name
     * @throws EntryNotFoundException if the given number doesn't exist in the phonebook
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
     * @param s the letter with which the name starts
     * @return a
     */
    String naSlovo(char s){
        String result = "";
        for (Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet())
                if (entry.getKey().charAt(0) == Character.toUpperCase(s))
                    result += entry.getKey() + " - " + entry.getValue().toString() + "\n";
        return result;
    }

    /**
     * returns a set of names of all people that live in the city passed as parameter
     * @param g the city that we're looking for
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
