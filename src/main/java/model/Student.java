package model;

public class Student {
    private String name;
    private int age;
    private String address;
    private String lop;
    private double avg;

    public Student() {
    }

    public Student(String name, int age, String address, String lop, double avg) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.lop = lop;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", lop='" + lop + '\'' +
                ", avg=" + avg +
                '}';
    }
}
