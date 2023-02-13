package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }
        float taxRate = 0.15f;
        if (salary > 10000 && salary <= 20000) {
            taxRate = 0.18f;
        } else if (salary > 20000) {
            taxRate = 0.20f;
        }
        float netIncome = salary * (1 - taxRate);
        System.out.println(netIncome);
    }
}
