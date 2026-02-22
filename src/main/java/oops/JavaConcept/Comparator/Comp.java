package oops.JavaConcept.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comp {
    public static class Player {
        private String name;
        private int ranking;
        private int age;

        public Player(int ranking,String name, int age) {
            this.name = name;
            this.ranking = ranking;
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public int getRanking(){
            return ranking;
        }

        public void setRanking(int ranking){
            this.ranking = ranking;
            return;
        }

        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + ranking + ", " + age + ")";
        }

    }
    public static class  PlayerComparator implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            return Integer.compare(o1.getRanking(),o2.getRanking());
        }
    }
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        PlayerComparator playerComparator = new PlayerComparator();
        Collections.sort(footballTeam,playerComparator);
        System.out.println("After Sorting : " + footballTeam);
    }

}