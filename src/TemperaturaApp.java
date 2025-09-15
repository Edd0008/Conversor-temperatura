public class TemperaturaApp {
    public static void main(String[] args){
        System.out.println("Preparando aplicativo...");
        System.out.println("****************************");
        System.out.println("  Conversor de Temperatura  ");
        System.out.println("****************************");

        Temperatura mostrarTemperaturas= new Temperatura();
        mostrarTemperaturas.obterDados();
    }

}
