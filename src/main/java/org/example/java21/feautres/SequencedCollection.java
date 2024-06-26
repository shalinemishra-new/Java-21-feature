package org.example.java21.feautres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequencedCollection {

    public static void main() {

        List<String> lis= new ArrayList<String>(Arrays.asList("shal","Pank","Jiva","Karan"));

        lis.addFirst("Pavan");
        lis.addLast("Neeraj");

        System.out.println("list after adding first and last element::- "+ lis);

        System.out.println(STR."Get first element::- \{lis.getFirst()}");
        System.out.println(STR."Get Last element::- \{lis.getLast()}");

        lis.removeFirst();
        System.out.println(STR."list after removing first ::- \{lis}");

        lis.removeLast();
        System.out.println(STR."list after removing Last ::- \{lis}");

        System.out.println(STR."Reversed List ::- \{lis.reversed()}");
    }
}
