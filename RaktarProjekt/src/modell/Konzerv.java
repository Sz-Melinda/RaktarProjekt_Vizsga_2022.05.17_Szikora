
package modell;

import java.util.Date;

public class Konzerv extends Elelmiszer {
    
    String leiras;
    String receptFajl;

    public Konzerv(String leiras, String receptFajl, String nev, String gyarto) {
        
        super(nev, gyarto);
        
        this.leiras = leiras;
        this.receptFajl = receptFajl;
    }
    
    public Konzerv(String leiras, String nev, String gyarto) {
        
        super(nev, gyarto);
        
        this.leiras = leiras;
    }

    public void receptMutat() {
       
       if(this.receptFajl.isEmpty()) {
       
       }
    }
}
