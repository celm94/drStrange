package HashCodeEquals;

import java.util.Objects;

public class Employee {
    String EmpID;
    String EmpDob;

    public Employee(String id, String dob){
        String EmpID = id;
        String EmpDob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(EmpID, employee.EmpID) && Objects.equals(EmpDob, employee.EmpDob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmpID, EmpDob);
    }
}
