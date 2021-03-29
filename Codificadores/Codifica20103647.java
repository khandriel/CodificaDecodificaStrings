package Codificadores;

public class Codifica20103647 implements Codifica {

    private static String alfabetoInvertido = "zyxwvutsrqponmlkjihgfedcba0987654321ZYXWVUTSRQPONMLKJIHGFEDCBA";
    private String data = "03292021";
    private int count = 0;
    private int controle = 0;

    @Override
    public String codifica (String str){
        
        String frase = "";
        for(char a : str.toCharArray()){
            for(int i = 0; i < alfabetoInvertido.length(); i++){
                if(a == alfabetoInvertido.charAt(i)){
                    String chave = String.valueOf(data.charAt(i % 8));
                    int chaveInt = Integer.parseInt(chave);
                    if(count > 8) count -= 8;
                    frase += alfabetoInvertido.charAt(i+chaveInt);
                    count++;
                    controle = 1;
                }
                else controle = 0;
            }
            if(controle == 0) frase += a;
        }


        return frase;
    }
    
}
