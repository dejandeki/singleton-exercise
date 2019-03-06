/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsingleton;

/**
 *
 * @author Deki
 */
public class EnumSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Abc obj1 = Abc.INSTANCE;
    obj1.i = 5;
    obj1.show();
        
    Abc obj2 = Abc.INSTANCE;
    obj2.i = 6;
    obj2.show();
    
    obj1.show();obj1.show();obj1.show();
    
}
    enum Abc{
        
        INSTANCE;
     int i;
     public void show(){
         System.out.println(i);
     }
    }
}