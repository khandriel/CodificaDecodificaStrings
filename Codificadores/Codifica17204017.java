package Codificadores;

public class Codifica17204017 implements Codifica {

    private String alfabetoQWERTY = "单1234567890:. ŷéQWERTYUIOPASDFGHJKLÇZXCVBNMqwertyuiopasdfghjklçzxcvbnm";
    private String alfabeto =       "单1234567890:. ãúABCDEFGHIJKLMNOPQRSÇTUVWXYZabcdefghijklmnopqrsçtuvwxyz";

    @Override
    public String codifica(String str) {
        char[] caracteres = str.toCharArray();
        String textoCodificado = "";
        for (int i = 0; i < str.length(); i++){
            int posicaoCaractere = alfabeto.indexOf(str.charAt(i));
            if (posicaoCaractere == -1)  
                posicaoCaractere = 0; 
            textoCodificado += alfabetoQWERTY.charAt(posicaoCaractere); 
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
