# REPORT

## 1. Use of Abstract Class

The abstract class `UniversityMember` is used as the base class for all university personnel. It contains common attributes such as `memberId` and `name`, along with the abstract method `performDuty()`.

Because it is abstract, objects of `UniversityMember` cannot be created directly. Subclasses must provide their own implementation of `performDuty()`.

---

## 2. Multilevel Inheritance

Multilevel inheritance is implemented through the following hierarchy:

`UniversityMember -> Employee -> AcademicStaff -> Professor`

Each subclass extends the previous class and introduces additional attributes and methods.

Examples:

* `Employee` adds salary information.
* `AcademicStaff` adds department information.
* `Professor` adds research-related information.

---

## 3. Dynamic Binding

Runtime polymorphism is demonstrated using:

```java
ArrayList<UniversityMember>
```

Different subclass objects are stored in the same collection. During runtime, the overridden `performDuty()` method of the actual object type is executed.

Example:

```java
member.performDuty();
```

This ensures flexibility and extensibility.

---

## 4. Need for Downcasting

Downcasting is necessary when accessing subclass-specific methods that are unavailable in the superclass.

Example:

```java
if(member instanceof Professor){
    Professor p = (Professor) member;
    p.showResearchProfile();
}
```

Here, `showResearchProfile()` exists only in the `Professor` class.

---

## 5. Future Extensibility

The design can easily be extended by adding new subclasses such as:

* LabEngineer
* Accountant
* SystemAdministrator

Because the system uses inheritance and polymorphism, new classes can integrate without major changes to existing code.
