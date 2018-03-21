package grinder;


import java.time.LocalTime;

public class EspressoGrinder extends Grinder {

    EspressoGrinder(LocalTime time){
        super(time);
    }

    @Override
    public double grind() {
        return 0.3;
    }
}
