import org.example.backup.Employee;

import java.io.IOException;





void main()
{

    Employee e1 = new Employee(10,"shal");
    Employee e2 = new Employee(10,"shal");
    System.out.println("both objects are equal " + e1.equals(e2));
   System.out.println(e1);
    test(e1);

}

private void test(Employee e) {

    if(e instanceof Employee(int age,String name)){

        System.out.println(age);
        System.out.println(name);
    }

/*    if(e instanceof Employee obj){
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }*/
}