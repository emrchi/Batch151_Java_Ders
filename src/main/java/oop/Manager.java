package oop;

public class Manager extends Secratary implements SalaryInterface {

    int baseSalary = 500;
    String project;

    public int calculateSalary(){
        System.out.println("MANAGER");
        return baseSalary+BONUS;
    }


}
