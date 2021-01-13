import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex4 {public static void main(String[] args) {
    ArrayList<String> arrayList=new ArrayList<>();
    for (int i = 0; i <10; i++) {
        Scanner sc=new Scanner(System.in);
        arrayList.add(sc.next());
    }
    Collections.sort(arrayList);
    System.out.println(arrayList.toString());
}
}
