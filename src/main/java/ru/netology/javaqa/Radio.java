package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;

    //управление выбором номера станции

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        int target = getCurrentStation() + 1;
        if (target < 10) {
            setCurrentStation(target);
        } else {
            setCurrentStation(0);
        }
    }

    public void prevStation() {
        int target = getCurrentStation() - 1;
        if (target < 0) {
            setCurrentStation(9);
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
