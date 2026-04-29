package src;
public class EmployeeView {
    public void printEmployeeDetails(Employee emp) {
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee email: " + emp.getEmail());
    }
}
