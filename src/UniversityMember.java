// Abstract Class
abstract class UniversityMember {

    protected int memberId;
    protected String name;

    // Constructor
    public UniversityMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Concrete Method
    public void displayBasicInfo() {
        System.out.println("Member ID : " + memberId);
        System.out.println("Name      : " + name);
    }

    // Abstract Method
    abstract void performDuty();
}
