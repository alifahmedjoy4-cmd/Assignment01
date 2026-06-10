// Employee inherits UniversityMember
class Employee extends UniversityMember {

    protected double salary;

    public Employee(int memberId, String name, double salary) {
        super(memberId, name);
        this.salary = salary;
    }

    // New Method
    public void showSalary() {
        System.out.println("Salary    : " + salary);
    }

    @Override
    void performDuty() {
        System.out.println(name + " performs general employee duties.");
    }
}
