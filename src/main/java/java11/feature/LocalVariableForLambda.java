package java11.feature;

interface Cal{
    int sum(int a, int b);
}

public class LocalVariableForLambda {
    public static void main(String[] args) {
        Cal cal = (var a, var b)-> {
            int result =   a + b;
            return result;
        };
        System.out.println(cal.sum(2,3));
    }
}
