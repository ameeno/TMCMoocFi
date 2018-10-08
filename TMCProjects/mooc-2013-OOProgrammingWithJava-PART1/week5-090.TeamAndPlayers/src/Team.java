import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> team;
    private int maxSize;


    public Team(String name, int maxSize) {
        this.name = name;
        this.maxSize = maxSize;
        this.team=new ArrayList<Player>();
    }

    public Team(String name) {
       this(name,16);
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player name) {
        if(team.size()<maxSize)team.add(name);
    }

    public void printPlayers() {
        for (Player x : team) {
            System.out.println(x.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return team.size();
    }

    public int goals(){
        int i=0;
        for (Player x: team){
            i+=x.goals();
        }

        return i;
    }


}

