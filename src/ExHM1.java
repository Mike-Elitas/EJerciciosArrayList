import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ExHM1 {
    public static void main(String[] args) {
        HashMap <Integer,String> pswd=new HashMap();
        pswd.put(123,"Pato");
        int chance=3;
        while (chance>0){
            Scanner sc=new Scanner(System.in);
            String attmp= sc.next();
            if (attmp==pswd.containsKey(123)) System.out.println("Ha accedit a l'area restringida");
            else{
                System.out.println("Incorrecte queden " + (chance-1) + " intents.");
                chance--;
            }
        }
        System.out.println("Ho sento, no té accés");
    }
}
