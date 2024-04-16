public class Folk {
    public static void main(String[] args) {
        CollegeGraduate graduate = new CollegeGraduate("Esmatullah Nickzad", "1995-01-01", 3.9, 2019);

        System.out.println("Name: " + graduate.getName());
        System.out.println("Birth Date: " + graduate.getBirthDate());
        System.out.println("GPA: " + graduate.getGpa());
        System.out.println("Year of Graduation: " + graduate.getYearOfGraduation());
    }
}

class Person {
    private String name;
    private String birthDate;

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}

class CollegeGraduate extends Person {
    private double gpa;
    private int yearOfGraduation;

    public CollegeGraduate(String name, String birthDate, double gpa, int yearOfGraduation) {
        super(name, birthDate);
        this.gpa = gpa;
        this.yearOfGraduation = yearOfGraduation;
    }

    public double getGpa() {
        return gpa;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }
}
