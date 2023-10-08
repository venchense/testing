public class Tank {

    int positionX, positionY;
    int dir;
    int fuel;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int positionX, int positionY) {
        this(positionX, positionY, 100);
    }

    public Tank(int positionX, int positionY, int fuel) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fuel = fuel;
    }


    public void goForward(int step) {
        if (fuel == 0) {
            System.out.println("No fuel");
            return;
        }
        if(step > fuel) {
            step = fuel;
        }
        fuel = fuel - step;
        if(dir == 0) {
            positionX += step;
        } else if(dir == 1) {
            positionY += step;
        } else if(dir == 2) {
            positionX -= step;
        } else if(dir == 3) {
            positionY -= step;
        }
        if(fuel == 0) {
            System.out.println("No more fuel");
        }
    }

    public void printPosition() {
        System.out.println("The Tank is at " + positionX +", " + positionY + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int step) {
        goForward(-step);
    }
}
