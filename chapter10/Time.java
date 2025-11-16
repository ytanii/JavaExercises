public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        long currentTime = System.currentTimeMillis();
        this.hour = (int) (currentTime / 3600000) % 24;
        this.minute = (int) (currentTime / 60000) % 60;
        this.second = (int) (currentTime / 1000) % 60;
    }

    public Time(long elapseTime) {
        this((int) (elapseTime / 3600000) % 24, (int) (elapseTime / 60000) % 60, (int) (elapseTime / 1000) % 60);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setTime(long elapseTime) {
        this.hour = (int) (elapseTime / 3600000) % 24;
        this.minute = (int) (elapseTime / 60000) % 60;
        this.second = (int) (elapseTime / 1000) % 60;
    }
}
