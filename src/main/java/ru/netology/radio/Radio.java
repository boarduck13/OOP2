package ru.netology.radio;

public class Radio {
    private int currentStationNumber;
    private int currentSoundVolume;
    private int countStations = 10;
    private int currentStationNumber = 0;
    private int currentSoundVolume = 0;

    public Radio(int countStations) {
        this.countStations = countStations;
    }

    public Radio() {

    }

    public int getCountStations() {
        return countStations;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber >= 0 && newCurrentStationNumber <= 9) {
            if (newCurrentStationNumber >= 0 && newCurrentStationNumber <= countStations - 1) {
                this.currentStationNumber = newCurrentStationNumber;
            }
        }
        public int getCurrentSoundVolume () {
        }

        public void nextStation () {
            if (currentStationNumber == 9) {
                if (currentStationNumber == countStations - 1) {
                    currentStationNumber = 0;
                } else {
                    currentStationNumber++;
                    public void nextStation () {

                        public void previousStation () {
                            if (currentStationNumber == 0) {
                                currentStationNumber = 9;
                                currentStationNumber = countStations - 1;
                            } else {
                                currentStationNumber--;
                            }
                        }
                        public void increaseVolume () {
                            if (currentSoundVolume == 100) {
                                return;
                            }
                            currentSoundVolume++;
                        }
                        public void turnDownVolume () {
                            if (currentSoundVolume == 0) {
                                return;
                            }
                            currentSoundVolume--;
                        }
                    }

                    public <__TMP__ > __TMP__ getCurrentStationNumber() {
                    }