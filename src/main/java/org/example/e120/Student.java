package org.example.e120;

public class Student {
    // Declare 3 instance variables: year, school name, and batch number

        // Declare instance variables
        private int year;
        private String schoolName;
        private int batchNumber;

        // Constructor to initialize the instance variables
        public Student(int year, String schoolName, int batchNumber) {
            this.year = year;
            this.schoolName = schoolName;
            this.batchNumber = batchNumber;
        }
    public void display() {
        System.out.println(year);
        System.out.println(schoolName);
        System.out.println(batchNumber);
    }

    public static void main(String[] args) {
        Student student1 =new Student()
    }
    }


