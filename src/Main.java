import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList of superclass type
        ArrayList<UniversityMember> members = new ArrayList<>();

        // Creating Objects
        Professor p1 = new Professor(
                101,
                "Dr. Rahim",
                85000,
                "CSE",
                "Artificial Intelligence",
                25
        );

        AdministrativeOfficer a1 =
                new AdministrativeOfficer(
                        201,
                        "Mr. Karim",
                        45000,
                        "A-12"
                );

        // Adding objects to collection
        members.add(p1);
        members.add(a1);

        System.out.println("===== UNIVERSITY MANAGEMENT SYSTEM =====\n");

        // Dynamic Binding
        for (UniversityMember member : members) {

            member.displayBasicInfo();

            // Runtime Polymorphism
            member.performDuty();

            System.out.println("----------------------------");
        }

        System.out.println("\n===== DOWNCASTING =====\n");

        // Safe Downcasting
        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                Professor p = (Professor) member;

                p.showResearchProfile();
            }
        }
    }
}
