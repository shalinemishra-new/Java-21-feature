package org.example.java21.feautres;

public class UnNamedPattern {
    public static void main(String[] args) {

        try {

            var i = 10 / 0;
            System.out.println(i);
        }
         catch(Exception _){
             System.out.println("Exception is here");
         }

    }
}
