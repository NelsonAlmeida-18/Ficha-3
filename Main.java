import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        /** Triangulo
        triangulo umtriangulo = new triangulo();
        triangulo umtriangulo2 = new triangulo();
        umtriangulo2.setP1(2,3);
        System.out.println(umtriangulo2.toString());
        System.out.println(umtriangulo.equals(umtriangulo2));
        */

        /** Youtube
        youtube video1 = new youtube();
        youtube video2 = new youtube();

        video1.thumbsUp();

        video1.setDate(LocalDate.of(2022,03,12));

        video1.insereCometario("Adoro o SirKazzio");
        video1.insereCometario("Adoro o Feromonas");
        System.out.println(video1.toString());

        System.out.println(video1.qtsDiasDepois());

        System.out.println(video1.equals(video2));
        */
        //newTelemovel.setArmApps(60);
        //newTelemovel.instalaApp("teste", 20);
        //System.out.println(newTelemovel.toString());
        //System.out.println(newtelemovel2.toString());
        //System.out.println(newTelemovel.toString());
        //newTelemovel.instalaApp("teste", 40);
        //newTelemovel.removeApp("teste", 20);
        //System.out.println(newTelemovel.equals(newtelemovel2));
        Youtube2 newVid = new Youtube2();
        newVid.setLikes(10);
        ArrayList<String> comentarios = new ArrayList<String>();
        comentarios.add("Adoro o vídeo");
        comentarios.add("Muito bom");
        newVid.setComments(comentarios);
        System.out.println(newVid.toString());
    }
}
