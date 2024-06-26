package org.example.java21.feautres;

public class NewSwitch {

    public static void main(String[] args) {
     String day="Sat";
     String time;

/*
     switch(day){

         case "Sat","Sun":
             time="6am";
             break;
         case "Wed":
             time="6am";
             break;
         default :
             time="8am";
             break;
        }
*/

        time= switch(day){

            case "Sat","Sun" ->
              "6am";

            case "Wed"->
                "6am";

            default ->
               "8am";

        };


        System.out.println(time);
    }


}
