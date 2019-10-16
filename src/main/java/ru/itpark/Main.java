package ru.itpark;

import ru.itpark.model.MegafonTariff;
import ru.itpark.model.OtherTariff;
import ru.itpark.model.TariffForModemRouterAndTablet;
import ru.itpark.model.TurnOnTariff;

public class Main {
    public static void main(String[] args) {
        MegafonTariff[] tariffs = new MegafonTariff[9];

        tariffs[0] = new TurnOnTariff(
                1,
                "Включайся! Смотри",
                false,
                "",
                650,
                30,
                true,
                true,
                1200,
                true,
                0,
                300,
                "Кино и сериалы в МегаФон ТВ",
                "Кэшбэк до 30%");

        tariffs[1] = new TurnOnTariff(
                2,
                "Включайся! Общайся",
                true,
                "",
                350,
                30,
                true,
                true,
                600,
                true,
                0,
                0,
                "Всегда оставайтесь на связи",
                "Кэшбэк до 30%");

        tariffs[2] = new TurnOnTariff(
                3,
                "Включайся! Развлекайся",
                false,
                "",
                300,
                30,
                true,
                true,
                100,
                false,
                10,
                0,
                "Безлимитный интернет на популярные сервисы",
                "Кэшбэк до 30%");

        tariffs[3] = new TariffForModemRouterAndTablet(
                4,
                "Твой безлимит на 6 месяцев",
                false,
                "Тариф без ограничений для использования дома и в поездках по России",
                3100,
                6,
                true,
                true,
                true);
        tariffs[4] = new TariffForModemRouterAndTablet(
                5,
                "Твой безлимит на 12 месяцев",
                false,
                "Тариф без ограничений для использования дома и в поездках по России",
                5100,
                12,
                true,
                true,
                true);
        tariffs[5] = new TariffForModemRouterAndTablet(
                6,
                "Мегафон - Онлайн",
                false,
                "Базовый тариф для подключения интернет-опций и использования на устройствах",
                0,
                1,
                true,
                true,
                false);
        tariffs[6] = new OtherTariff(
                7,
                "#Hello",
                false,
                "Тариф для иностранных туристов",
                750,
                14,
                false,
                true,
                30,
                false,
                true,
                false,
                false);
        tariffs[7] = new OtherTariff(
                8,
                "Посекундный",
                false,
                "Тариф без абонентской платы",
                0,
                0,
                false,
                true,
                0,
                false,
                false,
                true,
                false);
        tariffs[8] = new OtherTariff(
                9,
                "Умные вещи",
                false,
                "Тариф для умных устройств",
                20,
                7,
                true,
                true,
                0,
                true,
                false,
                false,
                true);

        for (MegafonTariff tariff : tariffs) {
            System.out.println(tariff);
        }





    }
}
