
package interfacee;


public class man implements one {

    @Override
    public void run() {
   
    
    }

    @Override
    public void move() {
   
    }
    
    @Override
    public void drink (){
       one.super.drink();
        System.out.println(" and woman milk");
    }
    
}
