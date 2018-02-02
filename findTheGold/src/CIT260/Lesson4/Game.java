/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Lesson4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author pewst
 */
public class Game implements Serializable {
    
    // Class variables
    private Map theMap;
    private Player thePlayer;
    private CropData cropData;
    private TeamMembers team[];
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools
    private ArrayList<ListItem> provisions;
    private Player player;
    
    // inserted constructors
    public Game(Map theMap, Player thePlayer, CropData cropData, TeamMembers[] team, ArrayList<ListItem> animals, ArrayList<ListItem> tools, ArrayList<ListItem> provisions) {
        this.theMap = theMap;
        this.thePlayer = thePlayer;
        this.cropData = cropData;
        this.team = team;
        this.animals = animals;
        this.tools = tools;
        this.provisions = provisions;
    }

    public Game(Player player) {
        this.player = player;
    }
    
        public Game(C player) {
        this.player = player;
    }
    
    // inserted getters and setters
    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    public TeamMembers[] getTeam() {
        return team;
    }

    public void setTeam(TeamMembers[] team) {
        this.team = team;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.theMap);
        hash = 53 * hash + Objects.hashCode(this.thePlayer);
        hash = 53 * hash + Objects.hashCode(this.cropData);
        hash = 53 * hash + Arrays.deepHashCode(this.team);
        hash = 53 * hash + Objects.hashCode(this.animals);
        hash = 53 * hash + Objects.hashCode(this.tools);
        hash = 53 * hash + Objects.hashCode(this.provisions);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.theMap, other.theMap)) {
            return false;
        }
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        if (!Objects.equals(this.cropData, other.cropData)) {
            return false;
        }
        if (!Arrays.deepEquals(this.team, other.team)) {
            return false;
        }
        if (!Objects.equals(this.animals, other.animals)) {
            return false;
        }
        if (!Objects.equals(this.tools, other.tools)) {
            return false;
        }
        if (!Objects.equals(this.provisions, other.provisions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "theMap=" + theMap + ", thePlayer=" + thePlayer + ", cropData=" + cropData + ", team=" + team + ", animals=" + animals + ", tools=" + tools + ", provisions=" + provisions + '}';
    }
    
}
