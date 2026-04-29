package src;
public class EmployeeController {
    private Employee e;
    private EmployeeView ev;

    public EmployeeController(Employee e, EmployeeView ev) {
        this.e = e;
        this.ev = ev;
    }

    public void setEmployeeName(String name) {
        e.setName(name);
    }

    public void setEmployeeEmail(String Email) {
        e.setEmail(Email);
    }

    public void setEmployeeId(int Id) {
        e.setId(Id);
    }

    public String getEmployeeName() {
        return e.getName();
    }

    public String getEmployeeEmail() {
        return e.getEmail();
    }

    public int getEmployeeId() {
        return e.getId();
    }

    public void view() {
        ev.printEmployeeDetails(this.e);
    }
}
