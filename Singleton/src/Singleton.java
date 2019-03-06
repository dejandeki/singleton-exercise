/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deki
 */
public class Singleton {
    public static void main(String[] args) {
        Abc obj = Abc.getInstance();
        
    }
}
    class Abc{
    static Abc obj = new Abc();
    
    int i;
    
    private Abc(){
        System.out.println("Object");}
    
    
    public static Abc getInstance(){
        return obj;
            }
    }

