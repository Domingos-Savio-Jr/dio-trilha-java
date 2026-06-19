public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println ("TV Ligada? " + smartTV.ligada);
        System.out.println ("Canal Atual " + smartTV.canal);
        System.out.println ("Volume Atual " + smartTV.volume);

        smartTV.Ligar();
        System.out.println ("Novo status -> TV Ligada? " + smartTV.ligada);

        smartTV.AumentarVolume();
        smartTV.AumentarVolume();
        smartTV.AumentarVolume();
        System.out.println ("Volume aumentado para" + smartTV.volume);

        smartTV.DiminuirVolume();
        System.out.println ("Volume diminuido para" + smartTV.volume);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        System.out.println ("Canal alterado para: " + smartTV.canal);
        
        smartTV.diminuirCanal();
        System.out.println ("Canal alterado para: " + smartTV.canal);

        smartTV.Desligar();
        System.out.println ("Novo status -> TV Ligada? " + smartTV.ligada);



    }
}
