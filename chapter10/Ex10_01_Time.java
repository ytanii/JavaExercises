public class Ex10_01_Time {
    public static void main(String[] args){
        Time clock1 = new Time();
        Time clock2 = new Time(555550000);
        Time clock3 = new Time(5,23,55);

        System.out.printf("clock1: %02d:%02d:%02d\n\n",clock1.getHour(),clock1.getMinute(),clock1.getSecond());
        System.out.printf("clock2: %02d:%02d:%02d\n\n",clock2.getHour(),clock2.getMinute(),clock2.getSecond());
        System.out.printf("clock3: %02d:%02d:%02d\n",clock3.getHour(),clock3.getMinute(),clock3.getSecond());



    }
}
