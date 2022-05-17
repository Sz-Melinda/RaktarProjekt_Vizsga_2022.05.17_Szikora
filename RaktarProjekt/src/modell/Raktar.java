
package modell;

import java.util.ArrayList;

public class Raktar {
    
    ArrayList<Elelmiszer> raktar;

    public Raktar() {
        
        this.raktar = new ArrayList();
    }
            
     
    public void elelmiszerRaktarozasa(Elelmiszer elelmiszer) {
        
        raktar.add(elelmiszer);
    }

    @Override
    public String toString() {
        
        return "Raktar{" + "raktar=" + raktar + '}';
    }
    
 
}
