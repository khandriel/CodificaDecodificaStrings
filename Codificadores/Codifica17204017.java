package Codificadores;

public class Codifica17204017 implements Codifica {
    private String alfabetoQWERTY = "1234567890:.ŷéQWERTYUIOPASDFGHJKLÇZXCVBNMqwertyuiopasdfghjklçzxcvbnm";
    private String alfabeto =       "1234567890:.ãúABCDEFGHIJKLMNOPQRSÇTUVWXYZabcdefghijklmnopqrsçtuvwxyz";

    @Override
    public String codifica(String str) {
        String textoCodificado = "";
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < alfabetoQWERTY.length(); j++){
                if (str.charAt(i) == ' '){
                    textoCodificado += " ";
                    break;
                }
                else if (str.charAt(i) == alfabeto.charAt(j)){
                    textoCodificado += alfabetoQWERTY.charAt(j);
                }
            }
        }
        return textoCodificado;
    }

    @Override
    public String decodifica(String str) {
        String textoDecodificado = "";
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < alfabeto.length(); j++){
                if (str.charAt(i) == ' '){
                    textoDecodificado += " ";
                    break;
                }
                else if (str.charAt(i) == alfabetoQWERTY.charAt(j)){
                    textoDecodificado += alfabeto.charAt(j);
                }
            }
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
