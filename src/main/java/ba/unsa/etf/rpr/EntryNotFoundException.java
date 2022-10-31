package ba.unsa.etf.rpr;

/**
 * Used when either a key or a value that we're searching for in hash-map doesn't exist
 */
public class EntryNotFoundException extends Exception{
    public EntryNotFoundException(String message){
        super(message);
    }
}
