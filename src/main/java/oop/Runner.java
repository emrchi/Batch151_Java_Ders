package oop;

public class Runner {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        Worker worker = new Worker();
        Secratary secratary = new Secratary();
        Manager manager = new Manager();

        Worker worker1 = new Secratary();
        System.out.println(((Secratary) worker1).calculateSalary(true));


        salaryCalculator.companySalaryCalculator(worker1);



    }

}
