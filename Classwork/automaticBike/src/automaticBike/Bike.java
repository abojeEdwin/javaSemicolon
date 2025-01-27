package automaticBike;


public class Bike {
    int speed = 0 ;
    private boolean isBikeOn = false;

    public void onBike() {
        isBikeOn =  true;
    }

    public boolean isBikeOn() {
        return isBikeOn;
    }

    public void offBike() {
        isBikeOn = false;
    }

    public int accelerate(int acceleration) {
        try{
            if(acceleration < 0){
                acceleration = 0;
                System.out.println("Something went wrong");
            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        return speed += acceleration;}

    public int decelerate(int deceleration) {
        try{
            if(deceleration < 0){
                deceleration = 0;
                System.out.println("Something went wrong");
            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
            return speed = deceleration - speed;}

    public int getSpeed() {return speed;}

    public int gearOne(int acceleration) {
        if(acceleration >= 0){
            return speed = speed + 1;
        }else if(acceleration < speed){
            return speed = speed - 1;
        }
        return 0;
    }


    public int gearTwo(int acceleration) {
        if(acceleration < speed){
            return speed = speed - 2;
        }
        return speed = speed + 2;
    }

    public int gearThree(int acceleration) {
        if(acceleration < speed){
            return speed = speed - 3;
        }
        return speed = speed + 3;
    }

    public int gearFour(int acceleration) {
        if(acceleration < speed){
            return speed = speed - 4;
        }
        return speed = speed + 4;
    }
}
