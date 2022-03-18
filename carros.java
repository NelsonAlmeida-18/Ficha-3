import java.time.LocalDate;

public class carros {
    private String marca;
    private String modelo;
    private LocalDate anoConstrucao;
    private int consumoMedioRef;
    private int kms;
    private int mediaConsumosInit;
    private int kmsLastTrip;
    private int mediaConsumoLastTrip;
    private int regen;
    private boolean state;


    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public LocalDate getAnoConstrucao(){
        return this.anoConstrucao;
    }

    public int getConsumoMedioRef(){
        return this.consumoMedioRef;
    }

    public int getKms(){
        return this.kms;
    }

    public int getMediaConsumosInit(){
        return this.mediaConsumosInit;
    }

    public int getKmsLastTrip(){
        return this.kmsLastTrip;
    }

    public int getRegen(){
        return this.regen;
    }

    public boolean getState(){
        return this.state;
    }

    public carros(carros umCarro){
        this.marca=umCarro.getMarca();
        this.modelo=umCarro.getModelo();
        this.anoConstrucao=umCarro.getAnoConstrucao();
        this.consumoMedioRef=umCarro.getConsumoMedioRef();
        this.mediaConsumosInit=umCarro.getMediaConsumosInit();
        this.kmsLastTrip=umCarro.getKmsLastTrip();
        this.regen=umCarro.getRegen();
        this.state=umCarro.getState();
    }


    public carros(){
        this.marca="";
        this.modelo="";
        this.anoConstrucao=null;
        this.consumoMedioRef=0;
        this.consumoMedioRef=0;
        this.mediaConsumosInit=0;
        this.kmsLastTrip=0;
        this.mediaConsumoLastTrip=0;
        this.regen=0;
        this.state=false;
    }

    public carros(String marca, String modelo, LocalDate anoConstrucao, int consumoMedioRef, int kms, int mediaConsumosInit,int kmsLastTrip, int mediaConsumoLastTrip,int regen,boolean state){
        this.marca=marca;
        this.modelo=modelo;
        this.anoConstrucao=anoConstrucao;
        this.consumoMedioRef=consumoMedioRef;
        this.kms=kms;
        this.mediaConsumosInit=mediaConsumosInit;
        this.kmsLastTrip=kmsLastTrip;
        this.mediaConsumoLastTrip=mediaConsumoLastTrip;
        this.regen=regen;
        this.state=state;
    }

    

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        
        if ((obj==null) || (this.getClass()!=obj.getClass()))
            return false;
        
        carros newCarro = (carros) obj;

        return (this.marca==newCarro.marca && this.modelo==newCarro.modelo && this.anoConstrucao==newCarro.anoConstrucao && this.consumoMedioRef==newCarro.consumoMedioRef && this.kms==newCarro.kms && this.mediaConsumosInit==newCarro.mediaConsumosInit && this.kmsLastTrip==newCarro.kmsLastTrip && this.mediaConsumoLastTrip==newCarro.mediaConsumoLastTrip && this.regen ==newCarro.regen && this.state==newCarro.state);
    }

    public carros clone(){
        return new carros(this);
    }


}
