public class Listing09_04_TestTV {
    public static void main(String args[]){
        TV tv1 = new TV();
        TV tv2 = new TV();

        tv1.turnOn();
        tv2.turnOn();


        tv1.setChannel(30);
        tv1.setVolume(3);

        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1 channel: " + tv1.channel);
        System.out.println("tv1 volume: " + tv1.volumeLevel);

        System.out.println();

        System.out.println("tv2 channel: " + tv2.channel);
        System.out.println("tv2 volume: " + tv2.volumeLevel);


    }
}
