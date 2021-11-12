package at.campus02.murko.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo{

        public static void main(String[] args) {
                ArrayList<Integer> list= new ArrayList<>();
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(3);
                int first=list.get(0);

                for(int i=0; i< list.size(); i++)
                {
                        int element=list.get(i);
                        System.out.println("element = " + element);
                }

                for(int element : list)
                {
                        System.out.println("element = " + element);
                }
        }
}
