package Codificadores;

public class Codifica17204017 implements Codifica {
    private String alfabetoQWERTY = "单1234567890:. ŷéQWERTYUIOPASDFGHJKLÇZXCVBNMqwertyuiopasdfghjklçzxcvbnm";
    private String alfabeto =       "单1234567890:. ãúABCDEFGHIJKLMNOPQRSÇTUVWXYZabcdefghijklmnopqrsçtuvwxyz";

    @Override
    public String codifica(String str) {
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
        String textoDecodificado = "";
        for (int i = 0; i < str.length(); i++){
            int posicaoCaractere = alfabetoQWERTY.indexOf(str.charAt(i));
            textoDecodificado += alfabeto.charAt(posicaoCaractere);
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

