import java.time.LocalDate;

public class Encomenda {
    private String nameClient;
    private String nifClient;
    private String clientAddress;
    private LocalDate dateOfOrder;
    private linhaDeEncomenda[] order;

    public double calculaValorTotal(){
        double total=0;
        int pos=0;
        while(pos<this.order.length){
            total+=this.order[pos].calculaValorLinhaEnc();
        }
        return total;
    }


    public double calculaValorDesconto(){
        double total=0;
        int pos=0;
        while(pos<this.order.length){
            total+=this.order[pos].calculaValorDesconto();
        }
        return total;
    }

    public int numeroTotalProdutos(){
        int total=0;
        int pos=0;
        while(pos<this.order.length){
            total+=this.order[pos].getQtt();
        }
        return total;
    }

    public boolean existeProdutoEncomenda(String ref){
        boolean present=false;
        int pos=0;
        String tempRef;
        while(pos<this.order.length && !present){
            tempRef=this.order[pos].getRef();
            if(tempRef.equals(ref)){
                present=true;
            }
        }
        return present;
    }

    public void acidionaLinha(linhaDeEncomenda linha){
//fazer o clone para tornar isto mais fácil
    }


}
