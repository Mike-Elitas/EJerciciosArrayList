import com.sun.jdi.event.StepEvent;

import java.util.ArrayList;

/*
    Created by Ivan
    in 13/01/2021
    Description:
*/
public class Ex1 {

    public static void main(String[] args) {
        ArrayList<String> companys = new ArrayList<>(6);
        companys.add("Adán");
        companys.add("Joshua");
        companys.add("Diego");
        companys.add("Nico");
        companys.add("Miguel");
        companys.add("Ismael");
        for (String company : companys) System.out.println(company);
    }
}
