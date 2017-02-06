
public class Car {
    int gear = 1;
    int speed = 0;
    int location;
    public final int DESTINATION = 250;

    public void reverseGear() {
        gear = -1;
    }

    public void gearUp () {
        if(gear == -1) {
            gear = 1;
        } else if(gear >= 6) {
            System.out.println("I cannot increase the gear anymore");
        } else {
            gear++;
        }
    }

    public void gearDown () {
        if(gear == -1) {
            System.out.println("I cannot decrease the gear because the car is in the reverse gear");
        } else if(gear == 1) {
            System.out.println("I cannot decrease the gear anymore");
        } else {
            gear--;
        }
    }

    public int reportGear () {
        return gear;
    }

    public int reportLocation () {
        return location;
    }

    public int reportRemaining () {
        return DESTINATION - location;
    }

    public void moveByTime (int time) {
        //0 is technically not a postive number.
        if(time < 1) {
            System.out.println("Time should be positive!");
            return;
        }
        speed = gear * 20;
        int delta = speed * time;
        location += delta;
    }

    public boolean isArrived () {
        return location >= DESTINATION;
    }
}
