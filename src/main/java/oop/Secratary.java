package oop;

public class Secratary extends Worker implements SalaryInterface {


    int baseSalary = 300;
    private int age;
    private String department;

    @Override
    public int calculateSalary() {
        System.out.println("SECRATARY");
        return baseSalary+BONUS;
    }

    public final int calculateSalary(boolean isSuccesfull) {
        System.out.println("SECRATARY 2 METHOD");
        if(isSuccesfull){
        return (baseSalary+BONUS)*2;
    }else{
            return (baseSalary+BONUS)/2;
        }

    }
}
