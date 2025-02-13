public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentado o canal para "+canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Dimuindo o canal para "+canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentado o volume para "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Dimuindo o volume para "+volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudar o canal para "+novoCanal);
    }

}
