// AcademicStaff inherits Employee
class AcademicStaff extends Employee {

    protected String department;

    public AcademicStaff(int memberId, String name,
                         double salary, String department) {

        super(memberId, name, salary);
        this.department = department;
    }

    // New Method
    public void teachCourse() {
        System.out.println(name + " teaches courses in "
                           + department + " department.");
    }

    @Override
    void performDuty() {
        System.out.println(name + " handles academic activities.");
    }
}
