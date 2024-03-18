package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;


public class RadioTest {
    @Test
    public void shouldSetStation() { //Выбор станции от 0 до 9
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverStation() { // Переключение станции выше 9
        Radio rad = new Radio();
        rad.setCurrentStation(11);
        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderStation() { // Переключение станции ниже 0
        Radio rad = new Radio();
        rad.setCurrentStation(4);
        rad.setCurrentStation(-1);
        int expected = 4;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() { // Следующая станция
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.nextStation();
        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfter() { // Следующая станция после 9
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevUnderStation() { // Предыдущая станция
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        rad.prevStation();
        int expected = 4;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() { // Предыдущая станция ниже 0
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncVolume() { // Увеличение громкости
        Radio vol = new Radio();
        vol.increaseVolume();
        int expected = 1;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldOverIncVolume() { // Увеличение громкости
        Radio vol = new Radio();
        for (int i = 0; i < 105; i++) {
            vol.increaseVolume();
        }
        int expected = 100;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDownVolume() { // Уменьшение громкости
        Radio vol = new Radio();
        vol.downgradeVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldUnderMinVolume() { // Уменьшение громкости
        Radio vol = new Radio();
        for (int i = 0; i < 30; i++) {
            vol.increaseVolume();
        }
        for (int i = 0; i < 4; i++) {
            vol.downgradeVolume();
        }
        int expected = 26;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}