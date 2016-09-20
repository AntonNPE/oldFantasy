package web.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> team = null;
    private int cost;
    private int TEAM_BUDGET = 100;
    private int goalkeepersCount;
    private int defendersCount;
    private int midfieldersCount;
    private int forwardsCount;

    public void addGoalkeepersCount() {
        this.goalkeepersCount++;
    }

    public void addDefendersCount() {
        this.defendersCount++;
    }

    public void addMidfieldersCount() {
        this.midfieldersCount++;
    }

    public void addForwardsCount() {
        this.forwardsCount++;
    }

    public int getGoalkeepersCount() {

        return goalkeepersCount;
    }

    public int getDefendersCount() {
        return defendersCount;
    }

    public int getMidfieldersCount() {
        return midfieldersCount;
    }

    public int getForwardsCount() {
        return forwardsCount;
    }

    public int getTEAM_BUDGET (){
        return TEAM_BUDGET;
    }

    public int transferMoney (){

        return TEAM_BUDGET - cost;
    }

    public void addCost(int price) {

        cost += price;

    }

    public int getCost() {
        return cost;
    }



    public Team() {
        team = new ArrayList<>();
    }

    public Player getPlayer(int i) {
        return team.get(i);
    }

    public void addPlayer(Player player) {

        team.add(player);

    }

    public int getTeamSize() {
        return team.size();
    }

    public void removePlayer(Player player) {
        team.remove(player);

    }

    @Override
    public String toString() {
        return "\n" + team;

    }
}