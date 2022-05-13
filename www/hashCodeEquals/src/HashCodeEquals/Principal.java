package HashCodeEquals;

public class Principal {
    public static void main(String[] args) {
        Employee Emp1 = new Employee("1", "abc");
        Employee Emp2 = new Employee("1", "abc");

        System.out.println(Emp1.hashCode());
        System.out.println(Emp2.hashCode());
        System.out.println(Emp1.equals(Emp2));
        Emp1.equals(Emp2);


    }
}
