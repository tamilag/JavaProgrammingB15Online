package day11;

public class SwitchAndIf_TurnLight_Warmup {
    public static void main(String[] args) {
        String room="Ki";
        switch (room){
            case "Bd":
            System.out.println("Turn on the bedroom lights");
            break;
            case "LR":
                System.out.println("Turn on the living room lights");
                break;
            case "Ki":
                System.out.println("Turn on the kitchen lights");
                break;
            case "Ha":
                System.out.println("Turn on the hallway lights");
            default:
                System.out.println("Lights are off");
        }
        String room1="Ki";
        if (room1=="Ki") {
            System.out.println("Kitchen lights on");
        }else if (room1=="Br") {
            System.out.println("Bedroom lights on");
        }else if (room1=="Ha") {
            System.out.println("Hallway lights on");
        }else {
            System.out.println("Lights off");
        }











    }

}
