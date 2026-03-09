package algorithms;

public class ParkingSystem {
    int big;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small){
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int car_type){
        if (car_type == 1){
            if (this.big>0){
            this.big -= 1;
            return true;
            }
        }
        if (car_type == 2){
            if (this.medium>0){
                this.big -= 1;
                return true;
            }
        }
        if (car_type == 3){
            if (this.small>0){
                this.big -= 1;
                return true;
            }
        }
        return false;
    }
}
