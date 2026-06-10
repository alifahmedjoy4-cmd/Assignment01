// Additional subclass derived from Employee
class AdministrativeOfficer extends Employee {

    private String officeRoom;

    public AdministrativeOfficer(int memberId, String name,
                                 double salary, String officeRoom) {

        super(memberId, name, salary);

        this.officeRoom = officeRoom;
    }

    // New Method
    public void manageOffice() {
        System.out.println(name +
                " manages office room " + officeRoom);
    }

    @Override
    void performDuty() {
        System.out.println(name +
                " manages university administration tasks.");
    }
}
