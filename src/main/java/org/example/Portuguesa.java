package org.example;

public class Portuguesa extends Pizza {

    public Portuguesa(float preco) {
        super(preco);
    }

    public float calcularPreco() {
        return this.preco + this.adicional.aumento();
    }
}
