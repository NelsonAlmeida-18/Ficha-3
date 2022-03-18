
public class futebol {
    private String visitado;
    private String visitante;
    private int state=-1;
    private int golosVisitado;
    private int golosVisitante;

    public void setVisitanteNome(String nome){
        if(this.state ==-1){
            this.visitante=nome;
        }
    }

    public void setVisitadoNome(String nome){
        if(this.state==-1)
            this.visitado=nome;
    }

    public void startGame(){
        if(this.state==-1)
            this.state=0;
    }

    public void endGame(){
        if(this.state==0)
            this.state=1;
    }

    public void goloVisitado(){
        if (this.state==0)
            this.golosVisitado+=1;
    }

    public void goloVisitante(){
        if (this.state==0)
            this.golosVisitante+=1;
    }

    public String resultadoAtual(){
        if(this.state==1){
            return "A equipa visitante marcou "+this.golosVisitante + " golos e a equipa visitada marcou " + this.golosVisitado+" golos!";
        }
        return "O jogo ainda ou ainda não começou ou ainda não terminou";
    }
}
