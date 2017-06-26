/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoed2;

import java.util.Random;

/**
 *
 * @author Cold
 */
public class prueba {
    
    public static void main(String[] args){
        
        IndexList indexList = new IndexList();
        
        Random ran = new Random(50);
        
        for (int i = 0; i < 10; i++) {
            Indice index = new Indice(1, ran.nextInt(50) + 1);
            
            indexList.AddIndex(index);
            
            System.out.println(indexList.GetIndex(i).getKey());
        }
        
        System.out.println("\n \n");
        
        indexList.Sort();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(indexList.GetIndex(i).getKey());
        }
    }
    
}
