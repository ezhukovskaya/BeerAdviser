package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    private static String createAmber() {
        List<String> amber = new ArrayList<>();
        amber.add("Fat Tire Amber Ale");
        amber.add("Tröegs Nugget Nectar");
        return getString(amber);
    }

    private static String createLight() {
        List<String> light = new ArrayList<>();
        light.add("Budweiser Select 55");
        light.add("Michelob Ultra Amber");
        return getString(light);
    }

    public static String getBrands(String beerType) {
        if (beerType.equals("light")) {
            return createLight();
        } else if (beerType.equals("amber")) {
            return createAmber();
        } else {
            return null;
        }
    }

    private static String getString(List<String> lists) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String list : lists) {
            stringBuilder.append(list).append("\n");
        }
        return stringBuilder.toString();
    }
}
