package SolidPrinciple_DIP;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(ResourcesInfo resource) {
        System.out.println("Student name: "+name + "\nBorrowing a " + resource.getResourceType() + ": " + resource.borrowItem() +"\n");
    }
}
