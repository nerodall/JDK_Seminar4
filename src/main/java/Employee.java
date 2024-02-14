public class Employee {
    int number;
    int phone;
    String name;
    int experience;

    public Employee(int number, int phone, String name, int experience) {
        this.number = number;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getNumber() {
        return number;
    }

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return
                "number " + number + ", phone " + phone + ", name " + name  + ", experience " + experience + "\n";
    }
}
