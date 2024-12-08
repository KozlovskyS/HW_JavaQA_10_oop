package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int quantityStation = 10; //количество станций по умолчанию
    private int minNumberStation = 0;
    private int maxNumberStation;

    public Radio () {
        this.maxNumberStation = quantityStation - 1;
    }

    public Radio (int quantityStation) {
        this.maxNumberStation = quantityStation - 1;
    }

    //управление выбором номера станции

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < minNumberStation) {
            return;
        }
        if (newStation > maxNumberStation) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        int target = getCurrentStation() + 1;
        if (target < maxNumberStation + 1) {
            setCurrentStation(target);
        } else {
            setCurrentStation(minNumberStation);
        }
    }

    public void prevStation() {
        int target = getCurrentStation() - 1;
        if (target < minNumberStation) {
            setCurrentStation(maxNumberStation);
        } else {
            setCurrentStation(target);
        }
    }

//управление уровнем громкости

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        int target = getCurrentVolume() + 1;
        if (target <= 100) {
            setCurrentVolume(target);
        }
    }

    public void decreaseVolume() {
        int target = getCurrentVolume() - 1;
        if (target >= 0) {
            setCurrentVolume(target);
        }
    }
}
