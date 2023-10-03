package org.example;

public class Marguerita extends Pizza {

    public Marguerita(float preco) {
        super(preco);
    }

    public float calcularPreco() {
        return this.preco + this.adicional.aumento();
    }
}
