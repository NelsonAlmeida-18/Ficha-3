import java.math.*;
import java.lang.StringBuilder;
//enviar professor e ver implementacao

public class triangulo {
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;

    public triangulo(){
        this.p1 = new Ponto();
        this.p2= new Ponto();
        this.p3=new Ponto();
    }

    public triangulo(Ponto p1, Ponto p2, Ponto p3){
        this.p1= p1.clone();
        this.p2= p2.clone();
        this.p3=p3.clone();
    }

    public triangulo(triangulo umTriangulo){
        this.p1 = umTriangulo.getP1();
        this.p2=umTriangulo.getP2();
        this.p3=umTriangulo.getP3();
    }


    public Ponto getP1(){
        return this.p1;
    }

    public Ponto getP2(){
        return this.p2;
    }

    public Ponto getP3(){
        return this.p3;
    }

    public void setP1(Ponto p1){
        this.p1=p1;
    }

    public void setP1(int x, int y){
        Ponto temp = new Ponto();
        temp.setX(x);
        temp.setY(y);
        this.p1=temp;
    }

    public void setP2(Ponto p1){
        this.p2=p1;
    }

    public void setP2(int x, int y){
        Ponto temp = new Ponto();
        temp.setX(x);
        temp.setY(y);
        this.p2=temp;
    }

    public void setP3(Ponto p1){
        this.p3=p1;
    }

    public void setP3(int x, int y){
        Ponto temp = new Ponto();
        temp.setX(x);
        temp.setY(y);
        this.p3=temp;
    }

    public double calculaPerimetroTriangulo(){
        return dist2Pontos(this.p1, this.p2)+dist2Pontos(p2, p3)+dist2Pontos(p3, p1);
    }

    public double calculaAreaTriangulo(){
        double s=calculaAreaTriangulo()/2;
        return Math.sqrt(s*(s-dist2Pontos(p1, p2))*(s-dist2Pontos(p2, p3))*(s-dist2Pontos(p3, p1)));
    }

    public double dist2Pontos(Ponto p1, Ponto p2){
        return Math.sqrt( Math.pow(p1.getX()-p2.getX(), 2)-Math.pow(p1.getY()-p2.getY(), 2));
    }

    public double alturaTriangulo(){
        return dist2Pontos(minimoY3Pontos(this.p1, this.p2, this.p3), maximoY3Pontos(this.p1, this.p2, this.p3));
    }

    public Ponto minimoY3Pontos(Ponto p1, Ponto p2, Ponto p3){
        int yp1 = p1.getY();
        int yp2 = p2.getY();
        int yp3 = p3.getY();
        if (yp1<yp2 && yp1<yp3)
            return p1;
        if (yp2<yp1 && yp2<yp3)
            return p2;
        if (yp3<yp1 && yp3<yp2)
            return p3;

        return p1;
    }

    public Ponto maximoY3Pontos(Ponto p1, Ponto p2, Ponto p3){
        int yp1 = p1.getY();
        int yp2 = p2.getY();
        int yp3 = p3.getY();
        if (yp1>yp2 && yp1>yp3)
            return p1;
        if (yp2>yp1 && yp2>yp3)
            return p2;
        if (yp3>yp1 && yp3>yp2)
            return p3;
        return p1;
    }

    public String toString(){
        StringBuilder newStr = new StringBuilder();
        newStr.append("O Ponto P1 tem coordenadas x,y:");
        newStr.append(this.p1.getX());
        newStr.append(",");
        newStr.append(this.p1.getY());
        newStr.append("\nO Ponto P2 tem coordenadas x,y:");
        newStr.append(this.p2.getX());
        newStr.append(",");
        newStr.append(this.p2.getY());
        newStr.append("\nO Ponto P3 tem coordenadas x,y:");
        newStr.append(this.p3.getX());
        newStr.append(",");
        newStr.append(this.p3.getY());
        return newStr.toString();
    }

    public triangulo clone(triangulo umTriangulo){
        return new triangulo(this);
    }


    //Não está a funcionar
    public boolean equals(Object umTriangulo){
        if (this==umTriangulo)
            return true;
        
        if (this.getClass()!=umTriangulo.getClass())
            return false;

        triangulo newTriangulo = (triangulo) umTriangulo;
        return (( this.p1.equals(newTriangulo.getP1()) || this.p1.equals(newTriangulo.getP2()) || this.p1.equals(newTriangulo.getP3()) )  && (this.p2.equals(newTriangulo.getP1()) || this.p2.equals(newTriangulo.getP2()) || this.p2.equals(newTriangulo.getP3()) ) && (this.p3.equals(newTriangulo.getP1()) || this.p3.equals(newTriangulo.getP2()) || this.p3.equals(newTriangulo.getP3())) );
    }
}
