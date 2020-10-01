public class Main {
    public static void main(String[] args) {
            Student student1 = new Student("Sam",1, 123456, "01001 Zilina");
            Student student2 = new Student("John", 2, 456789, "01001 Zilina");
            System.out.println(student1.getStudentNumber() + ", " + (student1.getPhoneNumber()) + ", " + (student1.getAddress()));
            System.out.println(student2.getStudentNumber() + ", " + (student2.getPhoneNumber()) + ", " + (student2.getAddress()));
            System.out.println(student1.getStudent());
        }
    }

class Student {
    String name;
    int studentNumber;
    int phoneNumber;
    String address;

    public Student(String name, int studentNumber, int phoneNumber, String address) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber ;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
    public String getStudent() {
        return name + ", " + studentNumber + ", " + phoneNumber + ", " + address;
    }
}
