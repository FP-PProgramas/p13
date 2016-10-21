
 */
package fp.problema.pkg013;
import java.util.*;

public class FpProblema013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double promedio , suma=0;
      
    int n[]= new int [30];
       Scanner entrada= new Scanner(System.in);
       for(int i=0; i<n.length; i++){
           System.out.println("Teclea un numero "+ (i + 1));
           n[i]=entrada.nextInt();
           suma= suma + n[i];
       }
        promedio=suma/30;
        
        int mayor=0,menor=0;
        int i=0;
        if(n[i] > promedio){
            mayor ++;
        }
        else if(n[i]< promedio){
        menor ++;
        }
        System.out.println("La suma es = " + suma);
        System.out.println("Promedio:" + promedio);    
        System.out.println("encima del promerdio son:" + mayor );
        System.out.println("debajo del promedio son:" + menor );
        }
    }
    
    


