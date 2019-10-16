package ru.itpark.model;

public abstract class MegafonTariff {
    private int tariffId;
    private String tariffName;
    private boolean hit;
    private String tariffDescription;
    private int tariffCost;
    private int tariffPeriod;
    private boolean ableToBeChosen;
    private boolean ableToFindOutDetails;

    public MegafonTariff(int tariffId, String tariffName, boolean hit, String tariffDescription, int tariffCost, int tariffPeriod, boolean ableToBeChosen ,boolean ableToFindOutDetails) {
        this.tariffId = tariffId;
        this.tariffName = tariffName;
        this.hit = hit;
        this.tariffDescription = tariffDescription;
        this.tariffCost = tariffCost;
        this.tariffPeriod = tariffPeriod;
        this.ableToBeChosen = ableToBeChosen;
        this.ableToFindOutDetails = ableToFindOutDetails;
    }

    public int getTariffId() {
        return tariffId;
    }

    public void setTariffId(int tariffId) {
        this.tariffId = tariffId;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public String getTariffDescription() {
        return tariffDescription;
    }

    public void setTariffDescription(String tariffDescription) {
        this.tariffDescription = tariffDescription;
    }

    public int getTariffCost() {
        return tariffCost;
    }

    public void setTariffCost(int tariffCost) {
        this.tariffCost = tariffCost;
    }

    public int getTariffPeriod() {
        return tariffPeriod;
    }

    public void setTariffPeriod(int tariffPeriod) {
        this.tariffPeriod = tariffPeriod;
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