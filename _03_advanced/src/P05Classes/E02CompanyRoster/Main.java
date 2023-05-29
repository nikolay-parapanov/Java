package P05Classes.E02CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentMap = new HashMap<>();

        while (n > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            Employee employee;
            if (tokens.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (tokens.length == 6) {
                employee = new Employee(name, salary, position, department, tokens[4], Integer.parseInt(tokens[5]));
            } else {
                try {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException ex) {
                    employee = new Employee(name, salary, position, department, tokens[4]);
                }
            }
            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getEmployees().add(employee);
            n--;
        }

        Department maxDepartment = departmentMap
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(f -> f.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + maxDepartment.getName());

        maxDepartment
                .getEmployees()
                .stream()
                .sorted((f,s)->Double.compare(s.getSalary(),f.getSalary()))
                .forEach(System.out::println);
    }
}

