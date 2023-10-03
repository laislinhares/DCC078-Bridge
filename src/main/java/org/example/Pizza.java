package org.example;

public abstract class Pizza {
    protected IngredienteAdicional adicional;
    protected float preco;

    public Pizza(float preco) {
        this.preco = preco;
    }

    public void setAdicional(IngredienteAdicional adicional) {
        this.adicional = adicional;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public abstract float calcularPreco();
}
