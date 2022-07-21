package pl.kurs.homework;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Employee jacek = new Employee("Jacek", "Placek", JobPosition.WORKER, Salary.BASE_2000, Achievements.MONEY, Achievements.EXTRA_DAY_OFF);
        Employee rysiu = new Employee("Ryszard", "Nowak", JobPosition.WORKER, Salary.BASE_2000, Achievements.MONEY, Achievements.VOUCHER);
        Employee marek = new Employee("Marek", "Kobra", JobPosition.FOREMAN, Salary.BASE_4000, Achievements.MONEY, Achievements.EXTRA_DAY_OFF, Achievements.VOUCHER);
        Employee zbigniew = new Employee("Zbigniew", "Kopka", JobPosition.MANAGER, Salary.BASE_7000, Achievements.MONEY, Achievements.COMPANY_CAR);
        Employee stachu = new Employee("Stanisław", "Schneider", JobPosition.DIRECTOR, Salary.BASE_10000, Achievements.COMPANY_CAR, Achievements.BUSINESS_HOLIDAYS);

        employees[0] = jacek;
        employees[1] = rysiu;
        employees[2] = marek;
        employees[3] = zbigniew;
        employees[4] = stachu;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
