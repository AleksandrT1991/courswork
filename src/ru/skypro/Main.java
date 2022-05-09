package ru.skypro;

public class Main {

    public static void typeAllFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    } // ������ ����������� � �������

    public static void monthSalary (Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
            System.out.println("C���� ������ �� �������� � �����" + " " + sum);
    } // ����� ������ �� �������� � �����

    public static void CountMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        String fullName = " ";
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        System.out.println("��������� � ����������� ���������: " + fullName + " " +  minSalary + " " +"������");
    } // ����������� ��������

    public static void CountMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        String fullName = " ";
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        System.out.println("��������� � ������������ ���������: " + fullName + " " +  maxSalary + " " + "������");
    } // ������������ ��������

    public static void averageSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        int average = sum / employees.length;
        System.out.println("������� �������� �� ��������" + " " + average);
    } // ������� �������� �������

    public static void allFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("��������� ��������: " + employee.getFullName());
        }
    } // ��� �����������

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("�������� ����� ����������", 1, 51000);
        employee[1] = new Employee("�������� ��������� ����������", 2, 50000);
        employee[2] = new Employee("�������� ���� ���������", 3, 52000);
        employee[3] = new Employee("���������� �������� ��������", 4, 53000);
        employee[4] = new Employee("������� ���� ������������", 5, 54000);
        employee[5] = new Employee("��������� ������ �������������", 1, 55000);
        employee[6] = new Employee("������ �������� ������������", 2, 56000);
        employee[7] = new Employee("������� ��������� ���������", 3, 57000);
        employee[8] = new Employee("������� ������ ������������", 4, 58000);
        employee[9] = new Employee("�������� ��������� ���������", 5, 59000);
        typeAllFullName(employee);
        monthSalary(employee);
        CountMinSalary(employee);
        CountMaxSalary(employee);
        averageSalary(employee);
        allFullName(employee);
    }
}