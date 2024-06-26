package org.example.java21.feautres;

public class PatternMatchingSwitch {

    public static void main(String[] args) {
        System.out.println( getDoubleUsingSwitch(2)); //Integer
        System.out.println( getDoubleUsingSwitch("22")); //String
        System.out.println( getDoubleUsingSwitch(22.52252f)); //Float
        System.out.println( getDoubleUsingSwitch(22.0)); //default
        System.out.println( getDoubleUsingSwitch(null)); //null

/*        System.out.println( getDoubleUsingIf(2)); //Integer
        System.out.println( getDoubleUsingIf("22")); //String
        System.out.println( getDoubleUsingIf(22.52252f)); //Float
        System.out.println( getDoubleUsingIf(22.0)); //default*/

     }

    static  double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            case null -> 0d;
            default -> 0d;
        };
}
   static double getDoubleUsingIf(Object o) {
        double result;
        if (o instanceof Integer) {
            result = ((Integer) o).doubleValue();
            System.out.println("Integer");
        } else if (o instanceof Float) {
            result = ((Float) o).doubleValue();
            System.out.println("Float");
        } else if (o instanceof String) {
            result = Double.parseDouble(((String) o));
            System.out.println("String");
        } else {
            result = 0d;
            System.out.println("Default");
        }
        return result;
    }

}
