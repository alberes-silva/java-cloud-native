public class Usuario {
    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        
        smartTv.diminuirCanal();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();

        smartTv.mudarCanal(17);


        System.out.println("---------- Status da SmartTV ----------");
        
        System.out.println("Status atual: -> TV ligada? " + smartTv.ligada);
        System.out.println("Status atual: -> Canal " + smartTv.canal);
        System.out.println("Status atual: -> Volume " + smartTv.volume);
    }
}
