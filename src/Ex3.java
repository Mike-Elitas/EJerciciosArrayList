import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <10; i++) {
            Scanner sc=new Scanner(System.in);
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.toString());
    }
}
