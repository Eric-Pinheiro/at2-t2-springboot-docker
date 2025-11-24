package com.at1_t2_springboot.concessionaria.model;

public class Carro {
    private Long id;
    private String modelo;
    private String marca;
    private Double preco;

    public Carro(Long id, String modelo, String marca, Double preco) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public Carro() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
}
