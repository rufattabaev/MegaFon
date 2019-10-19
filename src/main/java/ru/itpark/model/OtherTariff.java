package ru.itpark.model;

public class OtherTariff extends MegafonTariff {
    private int amountOfGigabytes;
    private boolean unlimitedInternet;
    private boolean unlimitedCalls;
    private boolean perSecondBilling;
    private boolean callsAndMessagesOnRussianNumbers;

    public OtherTariff(int id, String name, boolean hit, String description, int cost, int period, boolean ableToBeChosen, boolean ableToFindOutDetails, int amountOfGigabytes, boolean unlimitedInternet, boolean unlimitedCalls, boolean perSecondBilling, boolean callsAndMessagesOnRussianNumbers) {
        super(id, name, hit, description, cost, period, ableToBeChosen, ableToFindOutDetails);
        this.amountOfGigabytes = amountOfGigabytes;
        this.unlimitedInternet = unlimitedInternet;
        this.unlimitedCalls = unlimitedCalls;
        this.perSecondBilling = perSecondBilling;
        this.callsAndMessagesOnRussianNumbers = callsAndMessagesOnRussianNumbers;
    }

    public int getAmountOfGigabytes() {
        return amountOfGigabytes;
    }

    public void setAmountOfGigabytes(int amountOfGigabytes) {
        this.amountOfGigabytes = amountOfGigabytes;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    public boolean isUnlimitedCalls() {
        return unlimitedCalls;
    }

    public void setUnlimitedCalls(boolean unlimitedCalls) {
        this.unlimitedCalls = unlimitedCalls;
    }

    public boolean isPerSecondBilling() {
        return perSecondBilling;
    }

    public void setPerSecondBilling(boolean perSecondBilling) {
        this.perSecondBilling = perSecondBilling;
    }

    public boolean isCallsAndMessagesOnRussianNumbers() {
        return callsAndMessagesOnRussianNumbers;
    }

    public void setCallsAndMessagesOnRussianNumbers(boolean callsAndMessagesOnRussianNumbers) {
        this.callsAndMessagesOnRussianNumbers = callsAndMessagesOnRussianNumbers;
    }

    @Override
    public String toString() {
        String objectDisplay;
        objectDisplay = super.getName() + " " + super.getDescription();
        if(unlimitedInternet){
            objectDisplay = objectDisplay + " " + "Безлимитный интернет";
        } else if (amountOfGigabytes > 0){
            objectDisplay = objectDisplay + " " + amountOfGigabytes + "ГБ";
        }
        if (unlimitedCalls){
            objectDisplay = objectDisplay + " Безлимитные звонки внутри сети";
        }
        if (perSecondBilling){
            objectDisplay = objectDisplay + " Посекундная тарификация";
        }
        if (callsAndMessagesOnRussianNumbers){
            objectDisplay = objectDisplay + " Звонки и SMS на номера России";
        }
        objectDisplay = objectDisplay + " " + super.getCost() + "Р";
        if (super.isAbleToBeChosen()){
            objectDisplay = objectDisplay + " Выбрать";
        }
        if (super.isAbleToFindOutDetails()){
            objectDisplay = objectDisplay + " Подробнее";
        }
        return objectDisplay;
    }
}
