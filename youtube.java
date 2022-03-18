import java.beans.DesignMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.lang.StringBuilder;
import java.time.chrono.*;

public class youtube {
    private String name;
    private String dataOnVideo;
    private LocalDate dateOfUpload;
    private int res;
    private int lenMin;
    private int secs;
    private String[] comments;
    private int likes;
    private int dislikes;

    public youtube(){
        this.name="";
        this.dataOnVideo="";
        this.dateOfUpload=LocalDate.now();
        this.res=0;
        this.lenMin=0;
        this.secs=0;
        this.comments=new String[0];
        this.likes=0;
        this.dislikes=0;
    }

    public youtube(String name,String dataOnVideo,LocalDate dateOfUpload,int res,int lenMin,int secs,String[] comments,int likes,int dislikes){
        this.name=name;
        this.dataOnVideo=dataOnVideo;
        this.dateOfUpload=dateOfUpload;
        this.res=res;
        this.lenMin=lenMin;
        this.secs=secs;
        this.comments=comments;
        this.likes=likes;
        this.dislikes=dislikes;
    }

    public youtube(youtube video){
        this.name=video.getName();
        this.dataOnVideo=video.dataOnVideo();
        this.dateOfUpload=video.getDateOfUpload();
        this.res = video.getRes();
        this.lenMin=video.getLen();
        this.secs=video.getSecs();
        this.comments=video.getComments();
        this.likes=video.getLikes();
        this.dislikes=video.getDislikes();
    }

    public void setDate(LocalDate data){
        this.dateOfUpload=data;
    }

    public String getName(){
        return this.name;
    }

    public String dataOnVideo(){
        return this.dataOnVideo;
    }

    public LocalDate getDateOfUpload(){
        return this.dateOfUpload;
    }

    public int getRes(){
        return this.res;
    }

    public int getLen(){
        return this.lenMin;
    }

    public int getSecs(){
        return this.secs;
    }

    public String[] getComments(){
        return this.comments;
    }

    public int getLikes(){
        return this.likes;
    }
    
    public int getDislikes(){
        return this.dislikes;
    }


    public void insereCometario(String comment){
        String arr[] = new String[this.comments.length+1];
        int i;
        for(i=0; i<this.comments.length;i++){
            arr[i]=this.comments[i];
        }
        arr[i]=comment;
        this.comments=arr;
    }

    public long qtsDiasDepois(){
        LocalDate now = LocalDate.now();
        return ChronoUnit.DAYS.between(now, this.dateOfUpload);
    }

    public void thumbsUp(){
        this.likes+=1;
    }

    public String processa(){
        return this.dataOnVideo;
    }
    //problema ao printar o array de comentarios
    public String toString(){
        StringBuilder newStr = new StringBuilder();
        newStr.append("Nome do video: ");
        newStr.append(this.name);
        newStr.append("\nData no vídeo: ");
        newStr.append(this.dataOnVideo);
        newStr.append("\nData de Upload do vídeo: ");
        newStr.append(this.dateOfUpload);
        newStr.append("\nResolução do vídeo: ");
        newStr.append(res);
        newStr.append("\nTamanho do vídeo em minutos: ");
        newStr.append(this.lenMin);
        newStr.append("\nComentarios no vídeo: ");
        int i;
        for(i=0;i<this.comments.length;i++){
            newStr.append(this.comments[i]);
            if(i!=this.comments.length-1)
                newStr.append(", ");
        }
        newStr.append("\nNumero de likes no vídeo: ");
        newStr.append(this.likes);
        newStr.append("\nNumero de dislikes no vídeo: ");
        newStr.append(this.dislikes);
        return newStr.toString();
    }

    public youtube clone(){
        return new youtube(this);
    }

    public boolean equals(Object obj){
        if (this==obj)
            return true;
        
        if (this.getClass() != obj.getClass() || obj==null)
            return false;
        
        youtube newVideo = (youtube) obj;

        return ((this.name.equals(newVideo.getName())) && (this.dataOnVideo.equals(newVideo.dataOnVideo())) && (this.dateOfUpload.equals(newVideo.getDateOfUpload())) && (this.res==newVideo.getRes())  && (this.lenMin == newVideo.getLen())  &&  (this.secs == newVideo.getSecs())  &&  (this.comments.equals(newVideo.getComments()))  &&  (this.likes==newVideo.getLikes())  &&  (this.dislikes == newVideo.getDislikes())); 
    }
}
