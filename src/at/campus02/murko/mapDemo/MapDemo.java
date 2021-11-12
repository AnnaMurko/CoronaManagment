package at.campus02.murko.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap deklarieren
        HashMap<String, Integer> demo = new HashMap<>();
        demo.put("Anna",1);
        demo.put("Martina",2);
        System.out.println("demo = " + demo);
        demo.putIfAbsent("Lisa",4);
        demo.putIfAbsent("Lisa",2);

        Set<String> demos = demo.keySet();
        for (String s : demos) {
            System.out.println("s = " + s);
        }
        System.out.println("demo = " + demo);

        Set<Map.Entry<String, Integer>> entries = demo.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("entry = " + entry);
            
        }


    }
}
