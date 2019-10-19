package ru.itpark.model;

public abstract class MegafonTariff {
    private int id;
    private String name;
    private boolean hit;
    private String description;
    private int cost;
    private int period;
    private boolean ableToBeChosen;
    private boolean ableToFindOutDetails;

    public MegafonTariff(int id, String name, boolean hit, String description, int cost, int period, boolean ableToBeChosen, boolean ableToFindOutDetails) {
        this.id = id;
        this.name = name;
        this.hit = hit;
        this.description = description;
        this.cost = cost;
        this.period = period;
        this.ableToBeChosen = ableToBeChosen;
        this.ableToFindOutDetails = ableToFindOutDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public boolean isAbleToBeChosen() {
        return ableToBeChosen;
    }

    public void setAbleToBeChosen(boolean ableToBeChosen) {
        this.ableToBeChosen = ableToBeChosen;
    }

    public boolean isAbleToFindOutDetails() {
        return ableToFindOutDetails;
    }

    public void setAbleToFindOutDetails(boolean ableToFindOutDetails) {
        this.ableToFindOutDetails = ableToFindOutDetails;
    }
}