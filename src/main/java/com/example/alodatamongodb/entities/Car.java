package com.example.alodatamongodb.entities;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection="cars")
//public record Car(ObjectId _id, String marca, String modelo, int ano, String cor, double valor){};


@Document(collection = "cars")
public class Car {
    private ObjectId _id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double valor;

//    public Car(String marca, String modelo, int ano, String cor, double valor) {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.ano = ano;
//        this.cor = cor;
//        this.valor = valor;
//    }


    public Car(ObjectId _id, String marca, String modelo, int ano, String cor, double valor) {
        this._id = _id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.valor = valor;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
