class studentClass {
    String name;
    int age;
    String rollNumber;
    String houseNumber;


    public studentClass(int age, String name, String rollNumber, String houseNumber) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Student Details : {Name :"
                + name + "Age : " + age
                +" Roll No. : " + rollNumber
                +" House No. : " + houseNumber;
    }

    static void main(String[] args) {
        studentClass Student1 = new studentClass(20, "Oggy", "66", "24A");
        System.out.println(Student1);
    }

}
