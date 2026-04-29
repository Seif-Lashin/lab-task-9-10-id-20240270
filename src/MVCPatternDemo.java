package src;
public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee e = new Employee(20240270, "Seif Lashin", "seif@gmail.com");
        EmployeeView ev = new EmployeeView();
        EmployeeController ec = new EmployeeController(e, ev);

        ec.view();

        ec.setEmployeeEmail("seiflashin@gmail.com");

        ec.view();
    }
}
