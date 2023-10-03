package org.example;

public class Calabresa extends Pizza {

    public Calabresa(float preco) {
        super(preco);
    }

    public float calcularPreco() {
        return this.preco + this.adicional.aumento();
    }
}
