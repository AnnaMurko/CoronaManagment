package at.campus02.murko.setdemo;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(1);

        for(Integer number : mySet)
        {
            System.out.println();
        }
    }
}
