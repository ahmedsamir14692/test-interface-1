
package interfacee;


public interface one {
    
    int v=4;
   
    String name ="ahmed";
    void run(); // public abstract
    public abstract void move();
     default void drink (){
        System.out.print("water");
        
    }
    
    
}
