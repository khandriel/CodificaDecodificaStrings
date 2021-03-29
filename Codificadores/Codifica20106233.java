package Codificadores;

import java.util.HashMap;
import java.util.Map;

public class Codifica20106233 implements Codifica {

    private Map<Character, Integer> alfabetoLetras = new HashMap<Character, Integer>();
    private Map<Integer, Character> alfabetoNumeros = new HashMap<Integer, Character>();
    private String chave = "palavra";
    String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    @Override
    public String codifica(String str) {

        int indice = 0;
        String fraseCodificada = "";
        this.Mapeamento();

        for (char c : str.toCharArray()) {

            if (!Character.isLetterOrDigit(c) || alfabeto.indexOf(c) == -1) {
                fraseCodificada += c;
            } else {
                char local = chave.charAt(indice % chave.length());

                int cifra = (alfabetoLetras.get(c) + alfabetoLetras.get(local)) % alfabetoLetras.size();
                fraseCodificada += alfabetoNumeros.get(cifra);
                indice++;
            }

        }

        return fraseCodificada;
    }

    public void Mapeamento() {

        for (int i = 0; i < alfabeto.length(); i++) {
            alfabetoLetras.put(alfabeto.charAt(i), i);
            alfabetoNumeros.put(i, alfabeto.charAt(i));
        }

    }

    @Override
    public String decodifica(String str) {

        return null;
    }

    @Override
    public String getMatriculaAutor() {
        return "20106233";
    }

    @Override
    public String getNomeAutor() {
        return "Camila";
    }

}