// Professor inherits AcademicStaff
class Professor extends AcademicStaff {

    private String researchArea;
    private int publications;

    public Professor(int memberId, String name,
                     double salary, String department,
                     String researchArea, int publications) {

        super(memberId, name, salary, department);

        this.researchArea = researchArea;
        this.publications = publications;
    }

    // Professor Specific Method
    public void showResearchProfile() {

        System.out.println("Research Area : " + researchArea);
        System.out.println("Publications  : " + publications);
    }

    @Override
    void performDuty() {
        System.out.println(name +
                " conducts research and teaches university students.");
    }
}
