package com.company;

import java.util.ArrayList;

public class Team {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> playerArrayList= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if (playerArrayList.contains(player)){
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else {
            playerArrayList.add(player);
            System.out.println(player.getName() + " added to team " + this.getName());
            return true;
        }
    }

    public int numPlayers (){
        return this.playerArrayList.size();
    }

    public void matchresult (Team opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }

        played++;
        if (opponent!= null){
            opponent.matchresult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }
}



































