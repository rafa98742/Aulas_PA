package com.produto.api.model;
public class Produto{
    private Long id;
    private String nome;
    private String categoria;
    private Double preco;
    private String marca;

    public Produto(){
    }
    public Produto(Long id, String nome, String categoria, Double preco, String marca){
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.marca = marca;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    } 
    public Double getPreco(){ 
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public String getMarca(){ 
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
}