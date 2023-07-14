package com.arins.appbase.dto;

public class DtoProduct {
    
    private Long id;

    private String name;

    private Double harga;

    public DtoProduct(Long id, String name, Double harga) {
        this.id = id;
        this.name = name;
        this.harga = harga;
    }

    public DtoProduct() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }


}
