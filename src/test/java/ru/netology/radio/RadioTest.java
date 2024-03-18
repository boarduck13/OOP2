package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;


public class RadioTest {

    int countStations = 25;
    int minStation = 0;
    int minVolume = 0;
    int maxVolume = 100;
    int defCountStations = 10;
    Radio radio = new Radio(countStations);

    @Test
    public void shouldSetStationNumber() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(countStations - 1);

        int expected = countStations - 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

        radio.setCurrentStationNumber(0);

    @Test
    public void shouldSetDefaultStationNumber() {

        int expected = 0;
        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOverMax() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(countStations);

        radio.setCurrentStationNumber(10);

        int expected = 0;
        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {

        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);
        radio.setCurrentStationNumber(minStation - 1);

        int expected = 0;
        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxOnNextStation() {

        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.setCurrentStationNumber(countStations - 1);
        radio.nextStation();

        int expected = 0;
        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnNextStation() {

        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);
        radio.setCurrentStationNumber(countStations - 2);
        radio.nextStation();

        int expected = 9;
        int expected = countStations - 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMinOnPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.setCurrentStationNumber(minStation);
        radio.previousStation();

        int expected = 9;
        int expected = countStations - 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(1);
        radio.setCurrentStationNumber(minStation + 1);
        radio.previousStation();

        int expected = 0;
        int expected = minStation;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {

        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);
        radio.setCurrentSoundVolume(maxVolume);

        int expected = 100;
        int expected = maxVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeOverMax() {

        Radio radio = new Radio();

        radio.setCurrentSoundVolume(101);
        radio.setCurrentSoundVolume(maxVolume + 1);

        int expected = 0;
        int expected = minVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeUnderMin() {

        Radio radio = new Radio();
        radio.setCurrentSoundVolume(minVolume - 1);

        radio.setCurrentSoundVolume(-1);

        int expected = 0;
        int expected = minVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int expected = minVolume + 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {

        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);
        radio.setCurrentSoundVolume(maxVolume);
        radio.increaseVolume();

        int expected = 100;
        int expected = maxVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {

        Radio radio = new Radio();

        radio.setCurrentSoundVolume(1);
        radio.setCurrentSoundVolume(minVolume + 1);
        radio.turnDownVolume();

        int expected = 0;
        int expected = minVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownVolume() {

        Radio radio = new Radio();

        radio.turnDownVolume();

        int expected = 0;
        int expected = minVolume;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreateDefaultCountStations() {

        Radio defRadio = new Radio();

        int expected = defCountStations;
        int actual = defRadio.getCountStations();
        Assertions.assertEquals(expected, actual);
    }
}