public class PlanoOperadoraComSwitch {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {

            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minuots de ligação");
                break;
            } default:
                System.out.println("Código Inválido");
           
            
        }
    }
}
