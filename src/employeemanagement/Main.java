package employeemanagement;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        EmployeeData data = new EmployeeData();
        List<Employee> EmployeeDetails = data.getEmployeeData();
        EmployeeDetails.forEach(System.out::println);

        //Added New Employee Data
        System.out.println("\n" + "New EmployeeData Added");
        EmployeeDetails.add(new Employee(210, "Thowfic", "HrTeam", 530000));
        EmployeeDetails.forEach(System.out::println);

        // Data removed byId
        System.out.println("\n" + "Data removed byId");
        Predicate<Employee> removeById = getEmployeeByIdPredicate(201);
        EmployeeDetails.removeIf(removeById);
        EmployeeDetails.forEach(System.out::println);

        // Display Salary
        System.out.println("\n" + "Display Employee Salary  greater than five Lakhs");
        Predicate<Employee> highSalary = getEmployeePredicate(500000);
        EmployeeDetails.stream().filter(highSalary).forEach(System.out::println);

        // sorting salary in Ascending
        System.out.println("\nSalary sorted in Ascending Order");
        Comparator<Employee> salaryByAscending = getEmployeeSalaryByAscending();
        EmployeeDetails.stream().sorted(salaryByAscending).forEach(System.out::println);

        // sorted name in descending
        System.out.println("\n" + "Name sorted  in Descending Order");
        Comparator<Employee> nameByDescending = getEmployeeNameByDescending();
        EmployeeDetails.stream().sorted(nameByDescending).forEach(System.out::println);
    }
    private static Predicate<Employee> getEmployeePredicate(double sal) {
        return h -> h.getSalary() > sal;
    }
    private static Predicate<Employee> getEmployeeByIdPredicate(int id) {
        return e -> e.getId() == id;
    }

    private static Comparator<Employee> getEmployeeSalaryByAscending() {
        return Comparator.comparing(Employee::getSalary);
    }
    private static Comparator<Employee> getEmployeeNameByDescending(){
        return Comparator.comparing(Employee::getName).reversed();
    }
}

