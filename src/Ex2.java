import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static void main(String[] args) {
        int n= (int) (Math.random()*(10-20)+20);
        ArrayList<Integer> arrayList=new ArrayList<>(n);
        int suma=0;
        for (int i = 0; i < n; i++) {
            int a= (int) (Math.random()*100);
            arrayList.add(a);
            suma+=arrayList.get(i);
        }
        int media=suma/arrayList.size();
        System.out.println(arrayList.toString());
        System.out.println("suma= " + suma);
        System.out.println("media= " + media);
        Collections.sort(arrayList);
        System.out.println("Mínimo= " + arrayList.get(0));
        System.out.println("Máximo= " + arrayList.get(n-1));

    }
}
