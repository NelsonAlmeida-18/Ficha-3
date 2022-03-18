public class linhaDeEncomenda{
    private String ref;
    private String desc;
    private float price;
    private int qtt;
    private float tax;
    private float descontoComercial;

    public void setRef(String ref){
        this.ref =ref;
    }

    public void setDesc(String desc){
        this.desc=desc;
    }

    public void setPrice(float price){
        this.price = price;
    }
    public void setQtt(int qtt){
        this.qtt = qtt;
    }
    public void setTax(float tax){
        this.tax=tax/100;
    }
    public void setDesconto(float desconto){
        this.descontoComercial=desconto/100;
    }

    public int getQtt(){
        return this.qtt;
    }

    public String getRef(){
        return this.ref;
    }

    public void setEncomenda(linhaDeEncomenda umaEncomenda){
        this.ref=umaEncomenda.ref;
        this.desc=umaEncomenda.desc;
        this.price=umaEncomenda.price;
        this.qtt=umaEncomenda.qtt;
        this.tax=umaEncomenda.tax;
        this.descontoComercial=umaEncomenda.descontoComercial;
    }

    public double calculaValorLinhaEnc(){
        return (this.qtt*this.price)+(this.qtt*this.price*this.tax)-(this.qtt*this.price*this.descontoComercial);
    }

    public double calculaValorDesconto(){
        return (this.qtt*this.price*this.descontoComercial);
    }

}