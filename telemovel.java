import java.lang.StringBuilder;
import java.lang.Object;
import java.util.AbstractCollection;
import java.util.Arrays;

public class telemovel {
    private String marca;
    private String modelo;
    private double res;
    private int armMessages;
    private int armPic;
    private int armApps;
    private int totalUsed;
    private int numPics;
    private int numApps;
    private String[] installedApps;


    //Setters
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setRes(int res){
        this.res=res;
    }
    public void setArmMessages(int size){
        this.armMessages=size;
    }
    public void setArmPic(int size){
        this.armPic=size;
    }
    public void setArmApps(int size){
        this.armApps=size;
    }
    public void setTotalUsed(int totalused){
        this.totalUsed=totalused;
    }
    public void setNumPics(int num){
        this.numPics=num;
    }
    public void setNumApps(int num){
        this.numApps=num;
    }

    //Getters
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getRes(){
        return this.res;
    }
    public int getArmMessages(){
        return this.armMessages;
    }
    public int getArmPics(){
        return this.armPic;
    }
    public int getArmApps(){
        return this.armApps;
    }
    public int getTotalUsed(){
        return this.totalUsed;
    }
    public int getNumPics(){
        return this.numPics;
    }
    public int getNumApps(){
        return this.numApps;
    }
    public String[] getInstalledApps(){
        return this.installedApps;
    }

    public telemovel(){
        this.marca = "";
        this.modelo="";
        this.res=0;
        this.armMessages=0;
        this.armPic=0;
        this.armApps=0;
        this.totalUsed=0;
        this.numPics=0;
        this.numApps=0;
        this.installedApps=new String[0];
    }

    public telemovel(String marca,String modelo,double res,int armMessages,int armPic,int armApps,int totalUsed,int numPics,int numApps,String[] installedApps){
        this.marca=marca;
        this.modelo=modelo;
        this.res=res;
        this.armMessages=armMessages;
        this.armPic=armPic;
        this.armApps=armApps;
        this.totalUsed=totalUsed;
        this.numPics=numPics;
        this.numApps=numApps;
        this.installedApps=installedApps;
    }

    public telemovel(telemovel umMovel){
        this.marca = umMovel.getMarca();
        this.modelo=umMovel.getModelo();
        this.res=umMovel.getRes();
        this.armMessages=umMovel.getArmMessages();
        this.armPic=umMovel.getArmPics();
        this.armApps=umMovel.getArmApps();
        this.totalUsed=umMovel.getTotalUsed();
        this.numPics=umMovel.getNumPics();
        this.numApps=umMovel.getNumApps();
        this.installedApps=umMovel.getInstalledApps();
    }

    public boolean existeEspaco(int numeroBytes){
        return this.totalUsed+numeroBytes<this.armApps+this.armMessages+this.armPic;
    }

    public void instalaApp(String nome, int size){
        if(this.existeEspaco(size)){
            this.totalUsed+=size;
            String newApps[] = new String[this.installedApps.length+1];
            int i;
            for(i=0;i<this.installedApps.length;i++){
                newApps[i]=this.installedApps[i];
            }
            newApps[i]=nome;
            this.installedApps=newApps;
            this.numApps+=1;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marca do dispositivo: ");
        sb.append(this.marca);
        sb.append("\nModelo do dispositivo: ");
        sb.append(this.modelo);
        sb.append("\nResolução do dispositivo: ");
        sb.append(this.res);
        sb.append("\nDimensão do armazenamento para aplicações: ");
        sb.append(this.armApps);
        sb.append("\nDimensão para fotos: ");
        sb.append(this.armPic);
        sb.append("\nDimensão do armazenamento para mensagens: ");
        sb.append(this.armMessages);
        sb.append("\nEspaço no armazenamento usado: ");
        sb.append(this.totalUsed);
        sb.append("\nNúmero de fotos guardadas: ");
        sb.append(this.numPics);
        sb.append("\nNúmero de apps instaladas: ");
        sb.append(this.numApps);
        sb.append("\nApps instaladas:");
        int i;
        for(i=0;i<this.installedApps.length;i++){
            sb.append(this.installedApps[i]);
            if (i!=this.installedApps.length-1)
                sb.append(",");
        }
        return sb.toString();
    }

    public double tamMedioApps(){
        return this.armApps/this.numApps;
    }

    public void removeApp(String nome, int size){
        int numApp=existeApp(nome);
        if (numApp!=0){
            String newStr[] = new String[this.installedApps.length-numApp];
            int posI=0;
            int pos;
            for (pos=0;pos<this.installedApps.length;pos++){
                if (!this.installedApps[pos].equals(nome)){
                    newStr[posI]=this.installedApps[pos];
                    posI+=1;
                }
                pos+=1;
            }
            this.numApps-=numApp;
            this.totalUsed-=size*numApp;
            this.installedApps=newStr;
        }
    }

    private int existeApp(String nome){
        int numApp=0;
        for(int i=0;i<this.installedApps.length;i++){
            if(nome.equals(this.installedApps[i]))
                numApp+=1;
        }
        return numApp;
    }

    public telemovel clone(){
        return new telemovel(this);
    }

    public boolean equals(Object obj){
        if (obj==this){
            return true;
        }
        if (obj.getClass()!=this.getClass()  || obj==null)
            return false;

        telemovel newMovel = (telemovel) obj;
        //Falta comparar array de installed apps
        return (newMovel.getMarca().equals(this.marca) && newMovel.getModelo().equals(this.modelo)  && this.res==newMovel.getRes() &&  this.armMessages==newMovel.getArmMessages() && this.armPic==newMovel.getArmPics() && this.totalUsed==newMovel.getTotalUsed()  && this.numPics==newMovel.getNumPics()  && this.numApps==newMovel.getNumApps() && compareAllApps(this.installedApps, newMovel.getInstalledApps()));

    }

    private boolean compareAllApps(String[] installedApps1, String[] installedApps2){
        if (installedApps1.length != installedApps2.length)
            return false;

        else{
            boolean allExist=true;
            for(int i=0; i<installedApps1.length; i++){
                if (Arrays.binarySearch(installedApps2,installedApps1[i])<0)
                    allExist=true;
            }
            return allExist;
        }
    }
    
}
