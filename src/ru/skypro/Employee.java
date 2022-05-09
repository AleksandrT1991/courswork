package ru.skypro;

import java.util.Objects;

    public class Employee {
        private String fullName;
        private int department;
        private int salary;
        private static int counter;
        private int id;

        public Employee(String fullName, int department, int salary) {
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
            this.id = counter++;

        }
//        /////////////////////////////
        public int getId() {
            return id;
        }
        public String getFullName() {
            return fullName;
        }
        public int getDepartment() {

            return department;
        }
        public int getSalary() {

            return salary;
        }
//      /////////////////////////////////////////
//        public void setFullName(String fullName) {
//            this.fullName = fullName;
//        }
        public void setDepartment(int department) {
            this.department = department;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
//      ////////////////////////////////////////
        @Override
        public String toString() {
            return  "Ф.И.О сотрудника: " + fullName +
                    " отдел №: " + this.department +
                    " Заработная плата сотрудника: " + this.salary + " рублей " +
                    " ID: " + id;
        }
    }

