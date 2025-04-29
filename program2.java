class Student {
    private String studentName;

    public void setStudentName(String newStudentName) {
        studentName = newStudentName;
    }

    public String getStudentName() {
        return studentName;
    }
}

public class program2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentName("Sayem");
        System.out.println(s.getStudentName());
    }
}
