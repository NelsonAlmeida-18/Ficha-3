import java.lang.StringBuilder;
public class Ponto {
   private int x;
   private int y;
   
    public Ponto(int x, int y){
        this.x = x;
        this.y=y;
    }

    public Ponto(){
        this.x=0;
        this.y=0;
    }

    public Ponto(Ponto umPonto){
        this.x=umPonto.getX();
        this.y=umPonto.getY();
    }

   public void setX(int x){
       this.x=x;
   }

   public void setY(int y){
       this.y=y;
   }

   public int getX(){
       return this.x;
   }

   public int getY(){
       return this.y;
   }

   public String toString(){
       StringBuilder newStr = new StringBuilder();
       newStr.append("O ponto 1 tem como cordenadas: ");
       newStr.append(p1.getX());
       newStr.append(",");
       newStr.append(p1.getY());
       newStr.append("\nO ponto 2 tem como cordenadas: ");
       newStr.append(p2.getX());
       newStr.append(",");
       newStr.append(p2.getY());
       newStr.append("\nO ponto 3 tem como cordenadas: ");
       newStr.append(p3.getX());
       newStr.append(",");
       newStr.append(p3.getY());
       return newStr.toString();
   }

   public Ponto clone(){
        return new Ponto(this);
   }

   public boolean equals(Ponto umPonto){
        if (this ==umPonto)
            return true;

        if(this.getClass()!=umPonto.getClass())
            return false;

        Ponto newPonto = (Ponto) umPonto;
        return ((newPonto.x==this.x) && (newPonto.y==this.y));

   }
}
