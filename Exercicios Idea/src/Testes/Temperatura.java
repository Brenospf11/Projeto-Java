package Testes;

import java.util.Scanner;

public class Temperatura {
    Scanner ler = new Scanner(System.in);
    public void temperatura() {
        System.out.println("Qual temperatura deseja usar? (C/F/K)");
        String letra = ler.next();
        if(letra.equalsIgnoreCase("C")){
            Calculo_Celsius();
        } else if(letra.equalsIgnoreCase("F")){
            Calculo_fahrenheit();
        } else if(letra.equalsIgnoreCase("K")){
            Calculo_kelvin();
        }
    }
    public void Calculo_Celsius(){
        System.out.println("---------------");
        System.out.println("[1] Celsius -> Fahrenheit");
        System.out.println("[2] Celsius -> Kelvin");
        System.out.println("---------------------");
        System.out.println("Qual deseja realizar? ");
        int numero = ler.nextInt();
        switch(numero){
            case 1:
                System.out.println("Digite o numero em Celsius que deseja Converter: ");
                double calculo = ler.nextDouble();
                double fahrenheit = calculo * 9 / 5 + 32;
                System.out.println("O valor convertido foi " + calculo + "°C para " + fahrenheit + "ºF");
                break;
            case 2:
                System.out.println("Digite o numero em Celsius que deseja Converter: ");
                double calculo1 = ler.nextDouble();
                double kelvin = calculo1 + 273.15;
                System.out.println("O valor convertido foi " + calculo1 + "°C para " + kelvin + "ºK");
                break;
            default:
                System.out.println("Digite um numero VALIDO!!!!");
        }
    }
    public void Calculo_fahrenheit(){
        System.out.println("---------------------");
        System.out.println("[1] Fahrenheit -> Celsius");
        System.out.println("[2] Fahrenheit -> Kelvin");
        System.out.println("----------------");
        System.out.println("Qual deseja realizar? ");
        int numero = ler.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Digite o numero em Fahrenheit que deseja converter: ");
                double calculo = ler.nextDouble();
                double celsius = (calculo - 32) * 5 / 9;
                System.out.println("O valor convertido foi " + calculo + "°F para " + celsius + "°C");
                break;
            case 2:
                System.out.println("Digite o numero em Fahrenheit que deseja converter: ");
                double calculo1 = ler.nextDouble();
                double kelvin = (calculo1 = 459.67) * 5 / 9;
                System.out.println("O valor convertido foi " + calculo1 + "°F para " + kelvin + "°K");
            default:
                System.out.println("Digite um numero VALIDO!!!");
        }
    }
    public void Calculo_kelvin(){
        System.out.println("--------------------");
        System.out.println("[1] Kelvin -> Celsius");
        System.out.println("[2] Kelvin -> Fahrenheit");
        System.out.println("------------------------");
        int numero = ler.nextInt();
        switch (numero){
            case 1:
                System.out.println("Digite o numero em Kelvin que deseja converter: ");
                double calculo = ler.nextDouble();
                double celsius = calculo - 273.15;
                System.out.println("O valor convertido foi " + calculo + "°K para " + celsius + "°C");
                break;
            case 2:
                System.out.println("Digite o numero em Kelvin que deseja converter: ");
                double calculo1 = ler.nextDouble();
                double fahrenheit = calculo1 * 5 / 9 - 459.67;
                System.out.println("O valor convertido foi " + calculo1 + "°K para " + fahrenheit + "°F");
            default:
                System.out.println("Digite um numero VALIDO!!!");
        }
    }
}
