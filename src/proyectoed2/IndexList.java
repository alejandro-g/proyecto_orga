/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoed2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Cold
 */
public class IndexList {

    public ArrayList<Indice> indexlist = new ArrayList<Indice>();

    public IndexList() {
    }

    public ArrayList<Indice> getIndexlist() {
        return indexlist;
    }

    public void setIndexlist(ArrayList<Indice> indexlist) {
        this.indexlist = indexlist;
    }

    public int GetSize() {
        return indexlist.size();

    }
    
    public void clearList(){
        
        for (int i = 0; i < indexlist.size(); i++) {
            indexlist.remove(i);
        }
        
    }

    public void AddIndex(Indice index) {
        indexlist.add(index);
    }
    
    public Indice GetIndex(int pos){
        return indexlist.get(pos);
    }

    public void Sort() {
        int min;
        for (int i = 0; i < indexlist.size(); i++) {
            
            min = i;
            for (int j = i + 1; j < indexlist.size(); j++) {
                if (indexlist.get(j).getKey() < indexlist.get(min).getKey()) {
                    min = j;

                }
            }
            if (min != i) {
                Collections.swap(indexlist, i, min);
                
            }
        }
    }
}
