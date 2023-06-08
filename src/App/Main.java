package App;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<String>();

        carros.add("HRV");
        carros.add("C3");
        carros.add("Sandero");
        carros.add("Gol");
        carros.add("Volvo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Strada");
        carros.add("Ford Ka");
        System.out.println(carros);

        Iterator<String> it = carros.iterator();
        System.out.println(it.next());
        /*while(it.hasNext()){
            System.out.println(it.next());
        }*/
        /*while (it.hasNext()){
            String c = it.next();
            if (c == "Volvo"){
                it.remove();
            }
        }
        System.out.println(carros);*/



    }
}
