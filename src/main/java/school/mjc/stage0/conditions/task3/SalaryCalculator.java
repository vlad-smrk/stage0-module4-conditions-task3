package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        }
        double taxRate = 0.15;
        if (salary > 10000 && salary <= 20000) {
            taxRate = 0.18;
        } else if (salary > 20000) {
            taxRate = 0.20;
        }
        double netIncome = salary * (1 - taxRate);
        System.out.println(netIncome);
    }
}
