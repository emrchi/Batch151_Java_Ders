package emre;

import java.util.Scanner;

public class Harward3 {

    public static void main(String[] args) {


        int goalsHomeBarc = 3;
        int goalsAwayBarc = 1;
        int goalsHomeMad = 1;
        int goalsAwayMad = 3;
        int totalGoalsMad = goalsHomeMad + goalsAwayMad;
        int totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;

        if (totalGoalsMad == totalGoalsBarc) {
            // When the overall result is even,
            //goals scored away count double
            // so we update the goals away for
            //each team and compare again.
            goalsAwayBarc = goalsAwayBarc * 2;

            // The 'variable *= X' operator means
            //the same as 'variable = variable * X'
            goalsAwayMad *= 2;

            // We calculate again the overall result
            totalGoalsMad = goalsHomeMad + goalsAwayMad;
            totalGoalsBarc = goalsHomeBarc + goalsAwayBarc;

            // We show the result
            System.out.println("Overall Result is ");
            System.out.print("F.C. Barcelona " + totalGoalsBarc);
            System.out.println(" - Real Madrid " + totalGoalsMad);

            if (totalGoalsMad > totalGoalsBarc) {
                System.out.println("Madrid passes the round!");
            } else if (totalGoalsBarc>totalGoalsMad) {
                System.out.println("Barcelona passes the round!");
            }else
                System.out.println("Both teams will have to play for another 30 minutes of extra time and use penalty kicks to untie the match.");
        } else {
            // If the overall is not even
            // there is a clear winner.
            System.out.println("Overall Result is ");
            System.out.print("F.C. Barcelona " + totalGoalsBarc);
            System.out.println(" - Real Madrid " + totalGoalsMad);

            if (totalGoalsMad > totalGoalsBarc) {
                System.out.println("Madrid passes the round!");
            } if (totalGoalsBarc > totalGoalsMad) {
                System.out.println("Barcelona passes the round!");
            }
            }
            }

        }