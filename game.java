import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class game{
    public static void main(String[] args) {
        main obj = new main();
        obj.play();
    }
}

class level{
    private int points;
    private boolean goal;

    public boolean goalReached(int num){
        if (num == 0){
            goal = false;
        } else if (num == 1){
            goal = true;
        }

        return goal;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public int getPoints(){
        return points;
    }
}

class main{
    Scanner sc = new Scanner(System.in);

    private level level1 = new level();
    private level level2 = new level();
    private level level3 = new level();
    boolean goal;
    private int Bonus;
    ArrayList<Integer> list = new ArrayList<>();
    int plays;

    public main(){
        System.out.println("How many times do you want to play: ");
        plays = sc.nextInt();
        sc.nextLine();
    }

    public level getLevel(level level){
        return level;
    }

    public boolean isBonus(){
        Random rand = new Random();
        Bonus = rand.nextInt(0, 2);
        if (Bonus == 1){
            return true;
        } else{
            return false;
        }
    }

    public void play(){
        for(int i = 0; i < playManyTimes(plays); i++){
            System.out.println("Enter dog breed: ");
            String breed = sc.nextLine();

            if (breed.equals("Golden Retriever")){
                goal = level1.goalReached(1);
            } else {
                goal = level1.goalReached(0);
            }

            if (goal){
                level1.setPoints(1);
            } else{
                level1.setPoints(0);
            }
           
            System.out.println("Enter dog age: ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age == 5){
                goal = level2.goalReached(1);
            } else {
                goal = level2.goalReached(0);
            }

            if (goal){
                level2.setPoints(2);
            } else{
                level2.setPoints(0);
            }

            System.out.println("Enter dog name: ");
            String name = sc.nextLine();

            if (name.equals("Milo")){
                goal = level3.goalReached(1);
            } else {
                goal = level3.goalReached(0);
            }

            if (goal){
                level3.setPoints(3);
            } else{
                level3.setPoints(0);
            }

            if (isBonus()){
                list.add(3 * (getScore()));
                System.out.println("BONUS GAME!");
            } else{
                list.add(getScore());
            }
        }

        System.out.println("Highest score from all runs: " + highest());
    }
        

    public int getScore(){
        return (level1.getPoints() + level2.getPoints() + level3.getPoints());
    }

    public int playManyTimes(int num){
        return num;
    }

    public int highest(){
        int max = 0;
        for(int i = 0; i < playManyTimes(plays); i++){
            if (list.get(i) > max){
                max = list.get(i);
            } 
        }
        return max;
    }
}