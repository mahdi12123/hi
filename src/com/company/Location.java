package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private  int locationID;
    private  String description;
    private  Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String,Integer>();
    }
    public void addExit(String description,int location)
    {
        exits.put(description,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
