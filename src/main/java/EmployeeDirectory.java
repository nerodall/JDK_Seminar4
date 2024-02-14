import java.util.ArrayList;

public class EmployeeDirectory {
    ArrayList<Employee> employee = new ArrayList<>();

    public EmployeeDirectory() {
    }

    public void add(Employee newEmployee) {
        employee.add(newEmployee);
    }

    public ArrayList<Employee> searchExp(int exp) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee item :
                employee) {
            if (item.getExperience() == exp){
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList<Integer> searchPhone (String name){
        ArrayList <Integer> result = new ArrayList<>();
        for (Employee item:
             employee) {
            if (item.getName().equals(name)) result.add(item.getPhone());
        }
        return result;
    }

    public Employee searchEmployee (int number){
        for (Employee item:
             employee) {
            if (item.getNumber() == number)
                return item;
        }
        return null;
    }
}
