
public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status > Tv ligada!");

        smartTv.desligar();
        System.out.println("Novo Status > Tv desligada");

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("novo volume:" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("O canal atual é: " + smartTv.canal);
        ;

    }
}