package WrappersBoxingArrays;

public class WrappersDoJavaLang {
    public static void main(String[] args) {


        // primitivos, byte, short, int,     long, float, double e char.
        // Wrappers,   Byte, Short, Integer, Long, Float, Double e Character.
        int x = 5;
        Integer i = new Integer(5);

        byte y = i.byteValue();
        //xxxValue();

        String valor = "15.5";
        Float v = new Float(valor);

        System.out.println(v + 3);

        int idade = Integer.parseInt("27"); //parceXXX
        System.out.println("Daqui a 5 anos voce tera: " + (idade + 5) + " anos.");

        try {
            double custo = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
            System.out.println("Custo total: " + custo);
        } catch (NumberFormatException e) {
            System.out.println("Numero invalido para conversao.");
        }
    }
}
