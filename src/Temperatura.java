import java.util.Scanner;

public class Temperatura {
    double temperaturaEmCelcius;
    double temperaturaEmKelvin;
    double temperaturaEmFahrenheit;

    public static void main(String[] args) {
    }

    public void obterDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius:");
        temperaturaEmCelcius = leitor.nextDouble();

        calcularTemperaturas();
    }

    public void calcularTemperaturas() {

        temperaturaEmFahrenheit = (temperaturaEmCelcius * 1.8) + 32;
        temperaturaEmKelvin = temperaturaEmCelcius + 273.5;

        exibirResultados();
    }
    public void exibirResultados(){

        System.out.println(temperaturaEmCelcius + "°C equivalem a:");
        System.out.println(temperaturaEmFahrenheit +"°F (Fahrenheit)");
        System.out.println(temperaturaEmKelvin+ "K (Kelvin)");
        }
    }
