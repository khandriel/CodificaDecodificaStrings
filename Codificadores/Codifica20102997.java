package Codificadores;

public class Codifica20102997 implements Codifica{

    @Override
    public String codifica(String str){// Converte cada char em vários nulls seguidos por um "*"
        String output="";
        for(char c:str.toCharArray()){
            while(c-->0) output+="\0";
            output+="*";
        }
        return output;
    }

    @Override
    public String decodifica(String str){
        String output="";
        char aux='\0';
        for(char c:str.toCharArray()){
            if(c=='\0'){
                aux++;
            }else{
                output+=aux;
                aux='\0';
            }
        }
        return output;
    }
    
    @Override
    public String getNomeAutor(){
        return "Gustavo Galle de Melo";
    }

    @Override
    public String getMatriculaAutor(){
        return "20102997-2";
    }
}