import com.sun.jdi.event.StepEvent;

import java.util.ArrayList;

/*
    Created by Ivan
    in 13/01/2021
    Description:
*/
public class Ex1 {

    public static void main(String[] args) {
        ArrayList<String> companys = new ArrayList<String>();
        companys.add("Adán");
        companys.add("Joshua");
        companys.add("Diego");
        companys.add("Nico");
        companys.add("Miguel");
        companys.add("Ismael");
        for (int i = 0; i < companys.size(); i++) {
            System.out.println(companys.get(i));
        }
    }
}