public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv SmarTv = new SmartTv();

        SmarTv.deminuirVolume();
        SmarTv.deminuirVolume();
        SmarTv.aumentarVolume();
        SmarTv.aumentarVolume();

        System.out.println("TV ligada: " + SmarTv.ligada);
        System.out.println( "Canal Atual: " + SmartTv.canal);
        System.out.println("Volume Atual: " + SmarTv.volume);


        SmarTv.ligar();
        System.out.println("Novo Status -> TV ligada: " + SmarTv.ligada);


        SmarTv.desligar();
        System.out.println("Novo Status ->  TV ligada: " + SmarTv.ligada);

        SmarTv.mudarCanal(17);
        System.out.println("Canal Atual: " + SmartTv.canal);
    }
}
