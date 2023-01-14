package ru.netology.javaDz10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setNumberStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(6);

        int expected = 6;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberStationMax() {
        Radio radio = new Radio();

        int expected = radio.maxNumberStation;
        int actual = radio.getMaxNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberStationMin() {
        Radio radio = new Radio();

        int expected = radio.minNumberStation;
        int actual = radio.getMinNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberStationHigherMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(10);

        int expected = radio.minNumberStation;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberStationBelowMin() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(-1);

        int expected = radio.minNumberStation;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(6);
        radio.nextStation();

        int expected = 7;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberStationToMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(8);
        radio.nextStation();

        int expected = radio.maxNumberStation;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberStationFromMin() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberStationAfterMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(9);
        radio.nextStation();

        int expected = radio.minNumberStation;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(4);
        radio.prevStation();

        int expected = 3;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberStationFromMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberStationToMin() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(1);
        radio.prevStation();

        int expected = radio.minNumberStation;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberStationAfterMin() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(0);
        radio.prevStation();

        int expected = radio.maxNumberStation;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeStation() {
        Radio radio = new Radio();

        radio.setVolume(7);

        int expected = 7;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMax() {
        Radio radio = new Radio();

        int expected = radio.maxVolume;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMin() {
        Radio radio = new Radio();

        int expected = radio.minVolume;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeHigherMax() {
        Radio radio = new Radio();

        radio.setVolume(11);

        int expected = radio.minVolume;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = radio.minVolume;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeOnOneUp() {
        Radio radio = new Radio();

        radio.setVolume(4);
        radio.volumeUp();

        int expected = 5;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeToMax() {
        Radio radio = new Radio();

        radio.setVolume(9);
        radio.volumeUp();

        int expected = radio.maxVolume;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeFromMin() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.volumeUp();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeOnOneDown() {
        Radio radio = new Radio();

        radio.setVolume(7);
        radio.volumeDown();

        int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeFromMax() {
        Radio radio = new Radio();

        radio.setVolume(10);
        radio.volumeDown();

        int expected = 9;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeToMin() {
        Radio radio = new Radio();

        radio.setVolume(1);
        radio.volumeDown();

        int expected = radio.minVolume;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeAfterMax() {
        Radio radio = new Radio();

        radio.setVolume(10);
        radio.volumeUp();

        int expected = radio.maxVolume;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBeforeMin() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.volumeDown();

        int expected = radio.minVolume;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

}
