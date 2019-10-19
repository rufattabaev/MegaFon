package ru.itpark.model;

public class TariffForModemRouterAndTablet extends MegafonTariff {
    private boolean unlimitedInternet;

    public TariffForModemRouterAndTablet(int id, String name, boolean hit, String description, int cost, int period, boolean ableToBeChosen, boolean ableToFindOutDetails, boolean unlimitedInternet) {
        super(id, name, hit, description, cost, period, ableToBeChosen, ableToFindOutDetails);
        this.unlimitedInternet = unlimitedInternet;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    @Override
    public String toString() {
        String objectDisplay;
        objectDisplay = super.getName() + " " + super.getDescription();

        if (unlimitedInternet){
            objectDisplay = objectDisplay + " Безлимитный интернет";
        } else {
            objectDisplay = objectDisplay + " Оплата трафика по факту использования";
        }
        objectDisplay = objectDisplay + " " + super.getCost() + "Р ";

        if (super.isAbleToBeChosen()){
            objectDisplay = objectDisplay + "Выбрать ";
        }

        if (super.isAbleToFindOutDetails()){
            objectDisplay = objectDisplay + "Подробнее";
        }


        return objectDisplay;
    }
}
