package Codificadores;

public class Codifica20103647 implements Codifica {

    private static String alfabetoInvertido = "zyxwvutsrqponmlkjihgfedcba0987654321ZYXWVUTSRQPONMLKJIHGFEDCBA";
    private String data = "03292021";
    private String [] dataSeparada = data.split("");
    private int count;
    private boolean controle;

    @Override
    public String codifica (String str){
        
        String frase = "";
        count = 0;

        for(char a : str.toCharArray()){
            controle = false;
            for(int i = 0; i < alfabetoInvertido.length(); i++){
                if(a == alfabetoInvertido.charAt(i)){
                    controle = true;
                    int temp = count % 7;
                    int chave = Integer.parseInt(dataSeparada[temp]);
                    frase += alfabetoInvertido.charAt((i + chave) % alfabetoInvertido.length());
                    count++;
                }
            }
            if(controle == false) frase += a;
        }


        return frase;
    }

    @Override
    public String decodifica(String str){
        String frase = "";
        count = 0;
        for(char a : str.toCharArray()){
            controle = false;
            for(int i = 0; i < alfabetoInvertido.length(); i++){
                if(alfabetoInvertido.charAt(i) == a){
                    controle = true;
                    int temp = count % 7;
                    int chave = Integer.parseInt(dataSeparada[temp]);
                    //frase += alfabetoInvertido.charAt((i - chave) % alfabetoInvertido.length());
                    frase += alfabetoInvertido.charAt((alfabetoInvertido.length() + i - chave) % alfabetoInvertido.length());                    count ++;
                }
            }
           if(controle == false) frase += a;
        }


        return frase;
    }
    
    @Override
    public String getMatriculaAutor(){
        return "20103647";
    }

    @Override
    public String getNomeAutor(){
        return "Osmar Nether";
    }
}
