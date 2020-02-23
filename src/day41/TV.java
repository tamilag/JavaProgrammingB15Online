package day41;

public class TV {

    String brand ;
    boolean isOn;
    int currentChannel;

    /*
    behaviors:
    turnOn
    turnOff
    getCurrentChannel
    setCurrentChannel (newChannelNumber)
   	moveForward
	moveBackward
     */


    public void turnOn () {
        if (isOn==false){
            System.out.println("Turning on TV");
            isOn=true;
        }
    }

    public void turnOff () {
        if (isOn==true){
            System.out.println("Turning off TV");
            isOn=false;
        }
    }

    public int getCurrentChannel () {
        return currentChannel;
    }
    // valid channel range 0-50
    public void setCurrentChannel (int newChannelNumber ) {
        if (newChannelNumber<0 || newChannelNumber>50){
            System.out.println("Invalid channel");
            return; //get out of the method early
        }
        if (isOn==true){
            currentChannel=newChannelNumber;
        }else {
            System.out.println("Turn on your TV first");
        }
    }

    public void  moveForward () {
        currentChannel+=1;
    }
    public void moveBackward () {
        currentChannel-=1;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
