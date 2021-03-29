package Codificadores;

public class Codifica19204093 implements Codifica {

    // Retorna o autor do codificador
    @Override
    public String getNomeAutor() {
        return "Igor Vicente";
    }

    // Retorna a matrícula do autor do codificador
    @Override
    public String getMatriculaAutor() {
        return "19204093";
    }

    private static String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890çãàáâéêíóôõ,.?:'{}[]+-_=()!@#$%ˆ&*/|";
    private static int key = 9231847; // chave para criptografar e descriptografar a mensagem

    // Recebe um string e retorna o correspondente codificado
    @Override
    public String codifica(String str) {
        StringBuilder codificada = new StringBuilder();
        boolean finded;

        for (char c: str.toCharArray()){
            finded = false;
            for (int i=0; i<alfabeto.length(); i++){
                if (c == alfabeto.charAt(i)){
                    codificada.append(alfabeto.charAt( (i+key) % alfabeto.length() )); 
                    finded = true;
                    break;
                }
            }
            if (!finded){
                codificada.append(c);
            }
        }
        return codificada.toString();
    }

    // Recebe um string codificado e retorna o correspondente decodificado
    @Override
    public String decodifica(String str) {
        StringBuilder decodificada = new StringBuilder();
        boolean finded;

        for (char c: str.toCharArray()){
            finded = false;
            for (int i=0; i<alfabeto.length();i++){
                if (c == alfabeto.charAt(i)){
                    decodificada.append( alfabeto.charAt( Math.floorMod((i-key), alfabeto.length())) );
                    finded = true;
                    break;
                }
            }
            if (!finded){
                decodificada.append(c);
            }
        }
        return decodificada.toString();
    }
 
}