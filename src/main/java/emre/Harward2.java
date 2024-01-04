package emre;

import java.util.Scanner;

public class Harward2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Input The Goals of Barcelona...");
        int goalsBarc = input.nextInt();
        System.out.println("Please Input The Goals of Madrid...");
        int goalsMad = input.nextInt();
        System.out.println("The results was:");
        System.out.println("Barcelona "+goalsBarc +" - Madrid "+goalsMad);
        if(goalsMad > goalsBarc){
            System.out.println("Real Madrid won!");
            if((goalsMad-goalsBarc) > 3){
                System.out.println("What a match from Madrid players!");
            }
        }

        if(goalsBarc > goalsMad){
            System.out.println("F.C. Barcelona won!");
            if((goalsBarc-goalsMad) > 3){
                System.out.println("What a match from Barcelona players!");
            }
        }

        if(goalsMad == goalsBarc){
            System.out.println("They are even!");
        }

        if((goalsMad> 3) && (goalsBarc > 3)){
            System.out.println("Both teams scored more than 3 goals!");

        }

    }
}


