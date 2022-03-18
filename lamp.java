import java.time.LocalDateTime;
import java.time.chrono.*;
import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;

public class lamp {
    private int state; //0 turned of 1 turned on
    private boolean eco;
    private double consumoMax;
    private double consumoEco;
    private double consumo;
    private LocalDateTime firstTimeTurnedOn;
    private LocalDateTime lastTimeTurnedOn;
    private double consumototal;

    public lamp(){
        this.state=0;
        this.eco=false;
        this.consumo=0;
        this.consumoMax=0;
        this.consumoEco=0;
        this.consumoTotal=0;
    }
    public lamp(int state, boolean eco, double consumo, LocalDateTime timeTurnedOn){
        this.state=state;
        this.eco=eco;
        this.consumo=consumo;
        this.firstTimeTurnedOn=timeTurnedOn;
    }

    public lamp(lamp lampada){
        this.state=lampada.getState();
        this.eco = lampada.getEco();
        this.consumo= lampada.getConsumo();

        this.state=lamstate; //0 turned of 1 turned on
        boolean eco;
        double consumoMax;
        ouble consumoEco;
        double consumo;
        LocalDateTime firstTimeTurnedOn;
        LocalDateTime lastTimeTurnedOn;
        double consumotota
    }

    public int getState(){
        return this.state;
    }

    public boolean getEco(){
        return this.eco;
    }

    public double getConsumo(){
        return this.consumo;
    }

    public LocalDateTime getTurnedOnTime(){
        return this.firstTimeTurnedOn;
    }

}
