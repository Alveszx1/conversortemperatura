import java.util.Scanner;

public class ConvertGraus {
    double temperaturaEmCelsius;
    double temperaturaFahrenheit;
    double temperaturaKelvin;


    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");

        temperaturaEmCelsius = leitor.nextDouble();
        converterGraus();

    }
    public void converterGraus(){

        temperaturaFahrenheit = (temperaturaEmCelsius*1.8)+32;
        temperaturaKelvin = temperaturaEmCelsius+273.15;
        exibirResultados();

    }
    public void exibirResultados(){
        System.out.println(temperaturaEmCelsius+"ºC (Celsius) equivalem a: ");
        System.out.println(temperaturaFahrenheit+"ºF (Fahrenheit)");
        System.out.println(temperaturaKelvin+"ºK (Kelvin)");
    }
}
