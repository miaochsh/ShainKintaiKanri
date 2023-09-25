package jp.co.bss.kintai.model;

public class MonthData {
    private int currentMonth;

    public MonthData(int currentMonth) {
        this.currentMonth = currentMonth;
    }

    public int getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(int currentMonth) {
        this.currentMonth = currentMonth;
    }
}
