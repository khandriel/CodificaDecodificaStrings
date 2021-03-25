package Codificadores;

public class Codifica17204017 implements Codifica {
    int chave = (int)(Math.random() * (25 - 3 + 1) + 3);
    @Override
    public String codifica(String str) {
        char[] caracteres = str.toCharArray();
        String textoCodificado = "";
            for (char c : caracteres){
                c += chave;
               textoCodificado+= c;  
        }
        return textoCodificado;
    }

    @Override
    public String decodifica(String str) {
        char[] caracteres = str.toCharArray();
        String textoDecodificado = "";
        for (char c : caracteres){
            c -= chave;
            textoDecodificado += c;
        }
        return textoDecodificado;
    }

    @Override
    public String getMatriculaAutor() {
        return "17204017-2";
    }

    @Override
    public String getNomeAutor() {
        return "Elias Matos Garcia";
    }

}
