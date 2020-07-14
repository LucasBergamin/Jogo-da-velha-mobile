package com.example.jogodavelha;

import android.widget.Toast;

public class JogoDaVelha {

    private String jogo[][];
    private int num, contador;
    private int primeiro;
    private int segundo;

    public JogoDaVelha(){
        jogo = new String[3][3];
        num = -1;
        primeiro = 0;
        segundo = 0;
        contador = 0;
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int chequando(){
        //jogador 1
        // verificando se o jogador(x) ganhou pela horizontal
        if("x".equals(jogo[0][0]) && "x".equals(jogo[0][1]) && "x".equals(jogo[0][2])){
            return 0;
        }

        else if("x".equals(jogo[1][0]) && "x".equals(jogo[1][1]) && "x".equals(jogo[1][2])){
            return 0;
        }

        else if("x".equals(jogo[2][0]) && "x".equals(jogo[2][1]) && "x".equals(jogo[2][2])){
            return 0;
        }

        // verificando se o jogador(x) ganhou pela vertical
        else if("x".equals(jogo[0][0]) && "x".equals(jogo[1][0]) && "x".equals(jogo[2][0])){
            return 0;
        }

        else if("x".equals(jogo[0][1]) && "x".equals(jogo[1][1]) && "x".equals(jogo[2][1])){
            return 0;
        }

        else if("x".equals(jogo[0][2]) && "x".equals(jogo[1][2]) && "x".equals(jogo[2][2])){
            return 0;
        }

        // verificando se o jogador(x) ganhou pela diagonal

        else if("x".equals(jogo[0][0]) && "x".equals(jogo[1][1]) && "x".equals(jogo[2][2])){
            return 0;
        }

        else if("x".equals(jogo[0][2]) && "x".equals(jogo[1][1]) && "x".equals(jogo[2][0])){
            return 0;
        }

        // Jogador 2
        // verificando se o jogador(o) ganhou pela horizontal

        if("o".equals(jogo[0][0]) && "o".equals(jogo[0][1]) && "o".equals(jogo[0][2])){
            return 1;
        }

        else if("o".equals(jogo[1][0]) && "o".equals(jogo[1][1]) && "o".equals(jogo[1][2])){
            return 1;
        }

        else if("o".equals(jogo[2][0]) && "o".equals(jogo[2][1]) && "o".equals(jogo[2][2])){
            return 1;
        }

        // verificando se o jogador(x) ganhou pela vertical
        else if("o".equals(jogo[0][0]) && "o".equals(jogo[1][0]) && "o".equals(jogo[2][0])){
            return 1;
        }

        else if("o".equals(jogo[0][1]) && "o".equals(jogo[1][1]) && "o".equals(jogo[2][1])){
            return 1;
        }

        else if("o".equals(jogo[0][2]) && "o".equals(jogo[1][2]) && "o".equals(jogo[2][2])){
            return 1;
        }

        // verificando se o jogador(x) ganhou pela diagonal

        else if("o".equals(jogo[0][0]) && "o".equals(jogo[1][1]) && "o".equals(jogo[2][2])){
            return 1;
        }

        else if("o".equals(jogo[0][2]) && "o".equals(jogo[1][1]) && "o".equals(jogo[2][0])){
            return 1;
        }
        contador += 1;
        if(contador == 27){
            return 2;
        }

        return 3;
    }

    public boolean vez(){
        num = num + 1;
        if(num%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public void verificar(int um, int dois){
        if(vez()){
            jogo[um][dois] = "x";
        }else{
            jogo[um][dois] = "o";
        }
        num = num + 1;
    }

}
