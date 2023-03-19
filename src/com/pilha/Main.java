package com.pilha;

public class Main {
    public static void main(String[] args) {

        Pilha minhaPinha = new Pilha();

        minhaPinha.push(new NoPilha(1));
        minhaPinha.push(new NoPilha(2));
        minhaPinha.push(new NoPilha(3));
        minhaPinha.push(new NoPilha(4));
        minhaPinha.push(new NoPilha(5));
        minhaPinha.push(new NoPilha(6));

        System.out.println(minhaPinha);

        System.out.println(minhaPinha.pop());
        System.out.println(minhaPinha);

        System.out.println(minhaPinha.top());
        System.out.println(minhaPinha);

        minhaPinha.push(new NoPilha(99));
        System.out.println(minhaPinha);




    }

}
