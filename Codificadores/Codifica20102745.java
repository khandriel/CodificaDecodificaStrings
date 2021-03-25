package Codificadores;

public class Codifica20102745 implements Codifica {
 
    @Override
    public String codifica(String str) {// O código de codificação transforma os caracteres no valor de ASCII e a cada caracter adiciona um multiplo de 3 no valor ASCII. Ex => T = ASCII(84) + 0; a = ASCII(97) + 3; r = ASCII(114) + 6.
        
        String fraseCod = "";
        int num = 0;
        for (char letra : str.toCharArray()) {

            fraseCod += (int)letra + num +  " ";
            num += 3;
        }
        
        return fraseCod;
    }

    @Override
    public String decodifica(String str) {// O código de decodificação junta os números em uma string e quando houver um espaço transforma em números e subtraí um multiplo de 3 e transforma em o número em ASCII e pega o Caracter. Ex => 84 - 0 = ASCII(84) = T ; 100 - 3 = ASCII(97) = a; 120 - 6 = ASCII(114) = r.
       
        String fraseCod = "";
        String num = "";
        int num2 = 0;

        for (char letra : str.toCharArray()) {
            if (letra == ' ')
            {
                fraseCod += (char)(Integer.parseInt(num) - num2);
                num = "";
                num2 += 3;
            }

            else
            {
                num += letra;
            }
        }
        
        return fraseCod;
    }

    @Override
    public String getMatriculaAutor() {
        return "20102745";
    }

    @Override
    public String getNomeAutor() {
        return "Eduardo Spode Cardoso";
    }

}