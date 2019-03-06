/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonlazy;

/**
 *
 * @author Deki
 */
public class SingletonLazy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Abc obj = Abc.getInstance();
        Abc obj1 = Abc.getInstance();
    }
    
}
class Abc{
    static Abc obj;
    
    //int i;
    
    private Abc(){
        System.out.println("Instance created");}
    
    
    public static Abc getInstance(){
        if(obj ==null){
        obj = new Abc();
        }
        return obj;
            }
}
