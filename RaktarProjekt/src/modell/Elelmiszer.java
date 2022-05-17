
package modell;

import java.util.Date;

public abstract class Elelmiszer {
    
    String nev;
    String gyarto;
    Date lejarat;
    
    public Elelmiszer(String nev, String gyarto) {
        
        this.nev = nev;
        this.gyarto = gyarto;
        
        //this.lejarat = lejarat;
    }

    public Elelmiszer(String nev, String gyarto, Date lejarat) {
        
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejarat = lejarat;
    }
     
}
