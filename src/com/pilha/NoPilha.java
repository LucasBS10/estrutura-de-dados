package com.pilha;

public class NoPilha {
    private int dado;
    private NoPilha Refno = null;

    public NoPilha() {
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getRefno() {
        return Refno;
    }

    public void setRefno(NoPilha refno) {
        Refno = refno;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}
