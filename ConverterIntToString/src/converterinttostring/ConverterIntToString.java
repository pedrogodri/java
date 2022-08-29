package converterinttostring;

public class ConverterIntToString {

    public static void main(String[] args) {
        int postal = 89057301;
        String endereco = Integer.toString(postal);
        System.out.println(endereco);
        String idade = "25";
        
        int valor = Integer.parseInt(idade);
        System.out.println(valor);
        String v = "30.5";
        
        float x = Float.parseFloat(v);
        System.out.println(x);
    }
    
}
