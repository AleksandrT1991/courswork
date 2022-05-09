package ru.skypro;

public class Main {
    private static Employee[] employee = new Employee[10];
    private static void typeAllFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    } // список сотрудников с данными

    private static int monthSalary (Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
            System.out.println("Cумма затрат на зарплаты в месяц" + " " + sum);
        return sum;
    } // сумма затрат на зарплату в месяц

    private static void countMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        String fullName = " ";
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + fullName + " " +  minSalary + " " +"рублей");
    } // минимальная зарплата

    private static void countMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        String fullName = " ";
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + fullName + " " +  maxSalary + " " + "рублей");
    } // максимальная зарплата

    private static void averageSalary(Employee[] employees) {
        int sum = monthSalary(employees);
        int average = sum / employees.length;
        System.out.println("Среднее значение по зарплате" + " " + average);
    } // среднее значение зарплат

    private static void allFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Сотрудник компании: " + employee.getFullName());
        }
    } // фио сотрудников

//    public static void indexSalary (Employee[] employees) {
//        double index = 0;
//        for (Employee employee : employees) {
//            index = employee.getSalary() * 1.08;
//            System.out.println("После индексации зарпалата сотрудника: " + employee.getFullName()+ " установилась в размере " + index + " рублей");
//
//        }
//    }
//
//    public static void newMinSalary(Employee[] employees) {
//        int minSalary = employees[0].getSalary();
//        int department = 0;
//        for (Employee employee : employees) {
//            if (minSalary > employee.getSalary()) {
//                minSalary = employee.getSalary();
//                department = employee.department;
//            }
//        }
//        System.out.println("Сотрудник с максимальной зарплатой: " + department + " " + minSalary + " " + "рублей");
//    }

    public static void main(String[] args) {

        employee[0] = new Employee("Воронина Алена Викторовна", 1, 51000);
        employee[1] = new Employee("Воробьев Александр Николаевич", 2, 50000);
        employee[2] = new Employee("Чередник Илья Андреевич", 3, 52000);
        employee[3] = new Employee("Цыхмистров Владимир Петрович", 4, 53000);
        employee[4] = new Employee("Андреев Олег Владимирович", 5, 54000);
        employee[5] = new Employee("Кармазаин Сергей Александрович", 1, 55000);
        employee[6] = new Employee("Исаева Виктория Владимировна", 2, 56000);
        employee[7] = new Employee("Шашкова Анастасия Андреевна", 3, 57000);
        employee[8] = new Employee("Пичугин Максим Владимирович", 4, 58000);
        employee[9] = new Employee("Чесноков Александр Андреевич", 5, 59000);
        typeAllFullName(employee);
        monthSalary(employee);
        countMinSalary(employee);
        countMaxSalary(employee);
        averageSalary(employee);
        allFullName(employee);
//        indexSalary(employee);
//        newMinSalary(employee);
    }
}