public class ConversaoTemp {
    public static void main(String[] args) {
        double celsius = 25.7;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("O equivalente a %.2fºC, em Fahrenheit, é %.2f.", celsius, fahrenheit);

        int convertido = (int) fahrenheit;
        System.out.println("\nTemperatura: %d" + convertido);
    }
}
