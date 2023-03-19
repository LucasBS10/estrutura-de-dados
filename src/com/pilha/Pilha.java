package com.pilha;

public class Pilha {

    private NoPilha refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public NoPilha pop(){
        if(!this.isEmpty()){
            NoPilha noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefno();
            return noPoped;
        }
        return null;
    }

    public void push(NoPilha novoNo){
        NoPilha refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefno(refAuxiliar);
    }

    public NoPilha top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
//        if(refNoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refNoEntradaPilha == null ? true : false;
    }

}
