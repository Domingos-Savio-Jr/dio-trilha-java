public class SmartTV{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void Ligar(){
        ligada = true;
    }

    public void Desligar(){
        ligada = false;
    }

    public void AumentarVolume(){
        volume = volume +1;
    }

    public void aumentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

    public void DiminuirVolume(){
        volume = volume -1;
    }

}