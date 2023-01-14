package ru.netology.javaDz10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNumberStation() {
        Radio radio = new Radio(5);

//        radio.setNumberCurrentStation(7);
//
//        int expected = 7;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(5, radio.getNumberCurrentStation());
    }

    @Test
    public void setNumberStationMax() {
        Radio radio = new Radio(9);

//        int expected = radio.maxNumberStation;
//        int actual = radio.getMaxNumberStation();

        Assertions.assertEquals(radio.maxNumberStation, radio.getNumberCurrentStation());
    }

    @Test
    public void setNumberStationMin() {
        Radio radio = new Radio(0);

//        int expected = radio.minNumberStation;
//        int actual = radio.getMinNumberStation();

        Assertions.assertEquals(radio.minNumberStation, radio.getNumberCurrentStation());
    }

    @Test
    public void setNumberStationHigherMax() {
        Radio radio = new Radio(10);

//        radio.setNumberCurrentStation(10);
//
//        int expected = radio.minNumberStation;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(radio.minNumberStation, radio.getNumberCurrentStation());
    }

    @Test
    public void setNumberStationBelowMin() {
        Radio radio = new Radio(-1);

//        radio.setNumberCurrentStation(-1);
//
//        int expected = radio.minNumberStation;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(radio.minNumberStation, radio.getNumberCurrentStation());
    }

    @Test
    public void nextNumberStation() {
        Radio radio = new Radio(5);

        // radio.setNumberCurrentStation(6);
        radio.nextStation();

//        int expected = 6;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(6, radio.getNumberCurrentStation());
    }

    @Test
    public void nextNumberStationToMax() {
        Radio radio = new Radio(8);

//        radio.setNumberCurrentStation(8);
        radio.nextStation();

//        int expected = radio.maxNumberStation;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(radio.maxNumberStation, radio.getNumberCurrentStation());
    }

    @Test
    public void nextNumberStationFromMin() {
        Radio radio = new Radio(0);

//        radio.setNumberCurrentStation(0);
        radio.nextStation();

//        int expected = 1;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(1, radio.getNumberCurrentStation());
    }

    @Test
    public void nextNumberStationAfterMax() {
        Radio radio = new Radio(9);

//        radio.setNumberCurrentStation(9);
        radio.nextStation();

//        int expected = radio.minNumberStation;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(radio.minNumberStation, radio.getNumberCurrentStation());
    }

    @Test
    public void prevNumberStation() {
        Radio radio = new Radio(4);

//        radio.setNumberCurrentStation(4);
        radio.prevStation();

//        int expected = 3;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(3, radio.getNumberCurrentStation());
    }

    @Test
    public void prevNumberStationFromMax() {
        Radio radio = new Radio(9);

//        radio.setNumberCurrentStation(9);
        radio.prevStation();

//        int expected = 8;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(8,radio.getNumberCurrentStation());
    }

    @Test
    public void prevNumberStationToMin() {
        Radio radio = new Radio(1);

//        radio.setNumberCurrentStation(1);
        radio.prevStation();

//        int expected = radio.minNumberStation;
//        int actual = radio.minNumberStation;

        Assertions.assertEquals(radio.minNumberStation,radio.minNumberStation);
    }

    @Test
    public void prevNumberStationAfterMin() {
        Radio radio = new Radio(0);

//        radio.setNumberCurrentStation(0);
        radio.prevStation();

//        int expected = radio.maxNumberStation;
//        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(radio.maxNumberStation, radio.getNumberCurrentStation());
    }

    @Test
    public void setVolumeStation() {
        Radio radio = new Radio();

        radio.setVolume(75);

        int expected = 75;
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

        radio.setVolume(110);

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

        radio.setVolume(40);
        radio.volumeUp();

        int expected = 41;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeToMax() {
        Radio radio = new Radio();

        radio.setVolume(99);
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

        radio.setVolume(70);
        radio.volumeDown();

        int expected = 69;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeFromMax() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.volumeDown();

        int expected = 99;
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

        radio.setVolume(100);
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
