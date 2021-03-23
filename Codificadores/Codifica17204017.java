package Codificadores;

public class CodificaAA implements Codifica {
    private String alfabetoQWERTY = "QWERTYUIOPASDFGHJKLÇZXCVBNMqwertyuiopasdfghjklçzxcvbnm";
    private String alfabeto =       "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    @Override
    public String codifica(String str) {
        String textoCodificado = "";
        for (int i = 0; i <str.lenght(); i++){
            for (int j = 0; j < alfabetoQWERTY.lenght(); j++){
                if (str.charAt(i) == ' '){
                    textoCodificado += " ";
                    break;
                }

                else if (str.charAt(i) == alfabetoQWERTY.charAt(j)){
                    textoCodificado += alfabetoQWERTY.charAt(j);
                }
            }
        }
    }

    @Override
    public String decodifica(String str) {
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
