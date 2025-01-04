import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

/**
 * Flyweight design pattern is used for memory management,
 * Every class has 2 types of fields :
 * Extrinsic : these are the one's that change during the lifecycle of the
 * object
 * Intrinsic : these do not change during the lifecycle of the object
 * 
 * If there are thousnads of object of the class, there will be thousands of
 * intrinsics in each of these objects, having same
 * value which is not the best way to use memory. "" USE THIS PATTERN ONLY IF
 * THERE IS MEMORY CONSTRAINTS""
 * 
 * So we seperate our the extrinsic and intrinsic
 * Have only one object of the class having only the intrinsic and pass the
 * extrinsic to the object as function parameters whenever called.
 * NOTE : Cache the already created obejct to reuse / use the singleton pattern
 * NOTE : Intrinsic sate forms the part of the properties of the object
 * 
 */

interface IRobot {
    void move(int x, int y);
}

class GrountRobot implements IRobot {
    private String name;
    private ImageIcon icon;

    public GrountRobot(String name, ImageIcon icon) {
        this.name = name;
        this.icon = icon;
    }

    public void move(int x, int y) {
        System.out.println("Moving to x: " + x + " y: " + y);
    }
}

class AirRobot implements IRobot {
    private String name;
    private ImageIcon icon;
    private String communication;

    public AirRobot(String name, ImageIcon icon, String communication) {
        this.name = name;
        this.icon = icon;
        this.communication = communication;
    }

    public void move(int x, int y) {
        System.out.println("Moving to x: " + x + " y: " + y);
    }
}

// this is the caching layer, so we will reuse once formed, and on moving we can
// reuse the object
class RobotFactory {

    Map<String, IRobot> robotMap = new HashMap<>();

    public IRobot getRobot(String type) {
        IRobot robot = null;
        if (robotMap.containsKey(type)) { // check if the robot is already created
            robot = robotMap.get(type);
        }

        if (type == "GROUND") { // create the robot object
            robot = new GrountRobot("GROUND", new ImageIcon(""));
            robotMap.put(type, robot);
        } else if (type == "AIR") {
            robot = new AirRobot("GROUND", new ImageIcon("", ""), "");
            robotMap.put(type, robot);
        }
        return robot;
    }
}

class Main {
    public static void main(String[] args) {

        RobotFactory factory = new RobotFactory();
        IRobot robot = factory.getRobot("GROUND");
        robot.move(10, 20);
        robot = factory.getRobot("GROUND");
        robot.move(20, 10);
        // both the instances should be same
    }
}