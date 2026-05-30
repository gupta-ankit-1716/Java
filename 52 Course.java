class Course {

    static int maxCapacity = 100;
    int enrollments;
    String courseName;

    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrolledStudents = new String[maxCapacity];
        this.enrollments = 0;
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student removed.");
        enrollments--;
    }

    static void main(String[] args) {
        System.out.println("Course Management System.");
        Course XI = new Course("XI");
        Course XII = new Course("XII");
        Course X = new Course("X");
        Course IX = new Course("IX");

    }

}
