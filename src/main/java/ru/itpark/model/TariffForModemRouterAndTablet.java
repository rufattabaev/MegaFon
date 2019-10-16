package ru.itpark.model;

public class TariffForModemRouterAndTablet extends MegafonTariff {
    private boolean unlimitedInternet;

    public TariffForModemRouterAndTablet(int tariffId, String tariffName, boolean hit, String tariffDescription, int tariffCost, int tariffPeriod, boolean ableToBeChosen, boolean ableToFindOutDetails, boolean unlimitedInternet) {
        super(tariffId, tariffName, hit, tariffDescription, tariffCost, tariffPeriod, ableToBeChosen, ableToFindOutDetails);
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
        objectDisplay = super.getTariffName() + " " + super.getTariffDescription();

        if (unlimitedInternet){
            objectDisplay = objectDisplay + " Безлимитный интернет";
        } else {
            objectDisplay = objectDisplay + " Оплата трафика по факту использования";
        }
        objectDisplay = objectDisplay + " " + super.getTariffCost() + "Р ";

        if (super.isAbleToBeChosen()){
            objectDisplay = objectDisplay + "Выбрать ";
        }

        if (super.isAbleToFindOutDetails()){
            objectDisplay = objectDisplay + "Подробнее";
        }


        return objectDisplay;
    }
}
