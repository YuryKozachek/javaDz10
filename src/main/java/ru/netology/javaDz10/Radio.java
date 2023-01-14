package ru.netology.javaDz10;

public class Radio {
    private int numberCurrentStation;
    private int volume;
    final int maxNumberStation = 9;
    final int minNumberStation = 0;
    final int maxVolume = 10;
    final int minVolume = 0;

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < minNumberStation) {
            return;
        }
        if (newNumberCurrentStation > maxNumberStation) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    public void nextStation() {

        if (numberCurrentStation != maxNumberStation) {
            numberCurrentStation++;
        } else
            numberCurrentStation = minNumberStation;
    }

    public void prevStation() {
        if (numberCurrentStation != minNumberStation) {
            numberCurrentStation--;
        } else
            numberCurrentStation = maxNumberStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void volumeUp() {
        if (volume != maxVolume) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume != minVolume) {
            volume--;
        }
    }

}
