package oop;

public class Worker extends Person implements SalaryInterface {

    int baseSalary = 200;

    public int calculateSalary(){
        System.out.println("WORKER");
        return baseSalary+BONUS;
  }

}
