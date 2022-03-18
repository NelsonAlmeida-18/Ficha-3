import java.lang.Math;

public class Circulo {
   private int x;
   private int y;
   private int raio;
   
   public Circulo(){
       this.x=0;
       this.y=0;
       this.raio=0;
   }

   public Circulo(int x,int y){
       this.x=x;
       this.y=y;
       this.raio=0;
   }

   public Circulo(int x,int y, int raio){
       this.x =x;
       this.y=y;
       this.raio=raio;
   }

   public Circulo(Circulo umCirculo){
       this.x= umCirculo.getX();
       this.y= umCirculo.getY();
       this.raio= umCirculo.getRaio();
   }

   public int getX(){
       return this.x;
   }

   public int getY(){
       return this.y;
   }

   public int getRaio(){
       return this.raio;
   }

   public void setX(int x){
       this.x=x;
   }
   
   public void setY(int y){
       this.y=y;
   }

   public void setRaio(int raio){
       this.raio=raio;
   }

   public void alteraCentro(int x, int y){
       this.x=x;
       this.y=y;
   }

   public double calculaArea(){
       return Math.PI*this.raio*this.raio;
   }

   public double calculaPerimetro(){
       return 2*Math.PI*this.raio;
   }

   public boolean equals(Object umCirculo){
       if(this == umCirculo)
            return true;
        
        if(this.getClass()!=umCirculo.getClass() || umCirculo==null){
            return false;
        }

        Circulo newCirculo = (Circulo) umCirculo;
        return((this.x==newCirculo.x) && (this.y==newCirculo.y) && (this.raio==newCirculo.raio));

   }

   public Circulo clone(){
        return new Circulo(this);
   }

   
}
