package employeemanagement;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeData {
    private final List<Employee> EmployeeDetails = new LinkedList<>(List.of(
            new Employee(201, "Rithiga", "Development", 500000),
            new Employee(205, "Iniya", "Consulting", 450000),
            new Employee(208, "Gomathy", "Development", 600000),
            new Employee(207, "Hema", "Testing", 550000)
    ));

    public List<Employee> getEmployeeData() {
        return EmployeeDetails;
    }

}
