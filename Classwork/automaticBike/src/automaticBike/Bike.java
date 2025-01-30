package automaticBike;


public class Bike {
    int speed = 0 ;
    private boolean isBikeOn = false;
    private int gear = 1 ;

    public void onBike() {
        isBikeOn =  true;
    }

    public boolean isBikeOn() {
        return isBikeOn;
    }

    public void offBike() {
        isBikeOn = false;
    }

    public void accelerate() {
            if(isBikeOn){
                setGear();
            }
        }
        public void setGear() {
            if(speed >= 0 && speed <= 20){
                speed += 1;
            }else if(speed >= 21 && speed <= 30){
                speed += 2;
            }else if(speed >= 31 && speed <= 40){
                speed += 3;
            } else if(speed >= 41 && speed >= 50){
                speed += 4;
            }
        }

    public void decelerate() {
        if(speed >= 0 && speed <= 20){
            speed = speed - 1;
        }else if(speed >= 21 && speed <= 30){
            speed = speed - 2;
        }else if(speed >= 31 && speed <= 40){
            speed = speed - 3;
        } else if(speed >= 41 && speed >= 50){
            speed = speed - 4;
        }
    }

    public int getSpeed() {return speed;}

    public int gear() {
        return gear;
    }
}
