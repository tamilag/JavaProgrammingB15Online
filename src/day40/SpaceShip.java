package day40;

public class SpaceShip {
    String name;
    String currentDirection;
    int x;
    int y;

    /* Behaviors:
    1 setInitialPosition
    accept 1 String param to set direction
    /**
     * provide initial position of spaceship
     *
     * @param newX
     * @param newY
     */
    public void setInitialPosition(int newX, int newY) {
        x = newX;
        y = newY;
    }


    public void setDirection(String newDirection) {
        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {
            currentDirection = newDirection;
        } else {
            System.out.println("Wrong Direction");
            currentDirection="";
        }
    }

    /*
    2 move1Block
        no param
        change the position acc to direction
     */
    public void move1Block() {
        switch (currentDirection) {
            case "right":
                x += 1;
                break;
            case "left":
                x -= 1;
                break;
            case "up":
                y += 1;
                break;
            case "down":
                y -= 1;
                break;
            default:
                break;
        }
    }

    //add a new functionality to move1Block with direction provided in one shot
    /**
     * This will take a direction and move spaceship pbject 1 block
     * @param newDirection
     */
    public void move1Block(String newDirection){
        setDirection(newDirection);
    }

    /*
    3 toString Method
        return String representation of spaceship Object
     */
    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}


