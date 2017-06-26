
package proyectoed2;

import java.io.Serializable;

public class Indice implements Serializable {
    private int RRN;
    private int Key;

    public Indice(int RRN, int Key) {
        this.RRN = RRN;
        this.Key = Key;
    }

    public int getRRN() {
        return RRN;
    }

    public void setRRN(int RRN) {
        this.RRN = RRN;
    }

    public int getKey() {
        return Key;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }
    
    
    
}


