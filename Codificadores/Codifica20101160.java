package Codificadores;

public class Codifica20101160 implements Codifica {

    private int multiplicador = 8;

    @Override
    public String codifica(String str) {
        String retorno = "";
        for(int i = 0; i < str.length(); i++){
            retorno += Integer.toString(this.multiplicador*((int) str.charAt(i)));
            retorno += " ";
        }
        return retorno;
    }

    @Override
    public String decodifica(String str) {
        String retorno = "";
        String [] strA = str.split(" ");
        for(int i = 0; i < strA.length; i++){
            retorno += (char) ((Integer.parseInt(strA[i]))/this.multiplicador);
        }

        return retorno;
    }

    @Override
    public String getMatriculaAutor() {
        return "20101160";
    }

    @Override
    public String getNomeAutor() {
        return "Christian K. Goulart";
    }

}