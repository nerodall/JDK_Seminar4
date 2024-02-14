public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.add(new Employee(1,789,"Alex",12));
        employeeDirectory.add(new Employee(2,777,"Vova",5));
        employeeDirectory.add(new Employee(5,245,"Olga",12));
        employeeDirectory.add(new Employee(56,245,"Vova",3));

        //Поиск по стажу
        System.out.println(employeeDirectory.searchExp(12));
        //Поиск по имени и сбор номеров телефонов
        System.out.println(employeeDirectory.searchPhone("Vova"));
        //Поиск по табельному номеру
        System.out.println(employeeDirectory.searchEmployee(56));
    }
}
