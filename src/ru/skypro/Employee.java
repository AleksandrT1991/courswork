package ru.skypro;

import java.util.Objects;

    public class Employee {
        String fullName;
        int department;
        int salary;
        static int counter;
        int id;

        public Employee(String fullName, int department, int salary) {
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
            this.id = getCounter();
            counter++;
        }
//        /////////////////////////////
        public static int getCounter() {
            return counter;
        }
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

