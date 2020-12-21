
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int gameCount = 0;
        int gameWins = 0;
        int gameLosses = 0;
        try(Scanner scanner = new Scanner(Paths.get(file))) {
            
            while(scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] split = row.split(",");
                String team1 = split[0];
                String team2 = split[1];
                int team1Point = Integer.valueOf(split[2]);
                int team2Point = Integer.valueOf(split[3]);
                if(team1.equals(team)) {
                    if(team1Point > team2Point) {
                        gameWins++;
                    } else {
                        gameLosses++;
                    }
                    gameCount++;
                } else if (team2.equals(team)) {
                    if (team2Point > team1Point) {
                        gameWins++;
                    } else {
                        gameLosses++;
                    }
                    gameCount++;
                }
                
            }
            
            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + gameWins);
            System.out.println("Losses: " + gameLosses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
