import java.util.Scanner;

/** The purpose of this class is to model a television 
 * Huang Kaisheng <2020215138@stu.cqupt.edu.cn> - Apr. 29, 2021 */
class Television {
    /** store the brand of television */
    private final String MANUFACTURER;
    /** store the screen size of television */
    private final int SCREEN_SIZE;
    /** indicate if the television is on */
    private boolean powerOn;
    /** indicate the current channel */
    private int channel;
    /** indicate the current volume */
    private int volume;

    /**
     * initialize the television instance, with volume 20 and channel 2, powered off.
     * @param brand the brand of television
     * @param size the size of television screen
     */
    public Television(String brand, int size) {
        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;
        this.powerOn = false;
        this.volume = 20;
        this.channel = 2;
    }

    /**
     * get current volume
     * @return volume
     */
    public int getVolume() {
        return this.volume;
    }

    /**
     * get current channel
     * @return channel
     */
    public int getChannel() {
        return this.channel;
    }

    /**
     * get the manufacturer of television
     * @return manufacturer
     */
    public String getManufacturer() {
        return this.MANUFACTURER;
    }

    /**
     * get the screen size of television
     * @return screen size
     */
    public int getScreenSize() {
        return this.SCREEN_SIZE;
    }
    /**
     * set the current channel of television
     * @param station the station to be set
     */
    public void setChannel(int station) {
        this.channel = station;
    }
    
    /**
     * switch power state for television
     */
    public void power() {
        this.powerOn = !(this.powerOn);
    }

    /**
     * increase current volume by 1.
     */
    public void increaseVolume() {
        this.volume++;
    }

    /**
     * decrease current volume by 1.
     */
    public void decreaseVolume() {
        this.volume--;
    }
}

/** This class demonstrates the Television class */
public class TelevisionDemo {
    public static void main(String[] args) {
        // create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // declare variables
        int station; // the user’s channel choice

        // declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);
        // turn the power on
        bigScreen.power();
        // display the state of the television
        System.out.println("A " + bigScreen.getScreenSize() + " inch " + bigScreen.getManufacturer() + " has been turned on.");
        // prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();

        // change the channel on the television
        bigScreen.setChannel(station);
        // increase the volume of the television
        bigScreen.increaseVolume();
        // display the the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
        System.out.println("Too loud!! I am lowering the volume.");
        // decrease the volume of the television
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        // display the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
        System.out.println(); // for a blank line
        // HERE IS WHERE YOU DO TASK #5
        Television portable = new Television("Sharp", 19);
        portable.power();
        System.out.println("A " + portable.getScreenSize() + " inch " + portable.getManufacturer() + " has been turned on.");
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        portable.setChannel(station);
        portable.decreaseVolume();
        portable.decreaseVolume();
        System.out.println("Channel: " + portable.getChannel() + " Volume: " + portable.getVolume());
    }
}