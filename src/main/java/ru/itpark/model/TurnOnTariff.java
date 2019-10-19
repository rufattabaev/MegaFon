package ru.itpark.model;

public class TurnOnTariff extends MegafonTariff {
    private int amountOfMinutes;
    private boolean unlimitedInternet;
    private int amountOfGigabytes;
    private int amountOfMessages;
    private String descriptionOfPersonalOffer;
    private String descriptionOfCashback;

    public TurnOnTariff(int id, String name, boolean hit, String description, int cost, int period, boolean ableToBeChosen, boolean ableToFindOutDetails, int amountOfMinutes, boolean unlimitedInternet, int amountOfGigabytes, int amountOfMessages, String descriptionOfPersonalOffer, String descriptionOfCashback) {
        super(id, name, hit, description, cost, period, ableToBeChosen, ableToFindOutDetails);
        this.amountOfMinutes = amountOfMinutes;
        this.unlimitedInternet = unlimitedInternet;
        this.amountOfGigabytes = amountOfGigabytes;
        this.amountOfMessages = amountOfMessages;
        this.descriptionOfPersonalOffer = descriptionOfPersonalOffer;
        this.descriptionOfCashback = descriptionOfCashback;
    }

    public int getAmountOfMinutes() {
        return amountOfMinutes;
    }

    public void setAmountOfMinutes(int amountOfMinutes) {
        this.amountOfMinutes = amountOfMinutes;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    public int getAmountOfGigabytes() {
        return amountOfGigabytes;
    }

    public void setAmountOfGigabytes(int amountOfGigabytes) {
        this.amountOfGigabytes = amountOfGigabytes;
    }

    public int getAmountOfMessages() {
        return amountOfMessages;
    }

    public void setAmountOfMessages(int amountOfMessages) {
        this.amountOfMessages = amountOfMessages;
    }

    public String getDescriptionOfPersonalOffer() {
        return descriptionOfPersonalOffer;
    }

    public void setDescriptionOfPersonalOffer(String descriptionOfPersonalOffer) {
        this.descriptionOfPersonalOffer = descriptionOfPersonalOffer;
    }

    public String getDescriptionOfCashback() {
        return descriptionOfCashback;
    }

    public void setDescriptionOfCashback(String descriptionOfCashback) {
        this.descriptionOfCashback = descriptionOfCashback;
    }

    @Override
    public String toString() {
        String objectDisplay;
        objectDisplay = super.getName();

        if (isHit()){
            objectDisplay = objectDisplay + " " + "Хит";
        }
        objectDisplay = objectDisplay +" " +  amountOfMinutes;

        if (unlimitedInternet){
            objectDisplay = objectDisplay + " Безлимитный интернет";
        } else {
            objectDisplay = objectDisplay +" " + amountOfGigabytes;
        }
        if (amountOfMessages > 0){
            objectDisplay = objectDisplay + " " + amountOfMessages;
        }
        objectDisplay = objectDisplay + " " + descriptionOfPersonalOffer + " " + descriptionOfCashback + " " + super.getCost() + "Р " + super.getPeriod() + " дней ";

        if (super.isAbleToBeChosen()){
            objectDisplay = objectDisplay + "Выбрать ";
        }

        if (super.isAbleToFindOutDetails()){
            objectDisplay = objectDisplay + "Подробнее";
        }

        return objectDisplay;
    }
}
