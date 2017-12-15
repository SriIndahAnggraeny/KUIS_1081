/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1081.entity;

/**
 *
 * @author PC320-10
 */
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mobil_1081")


public class Mobil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
    @Column(length = 11, nullable = false, unique = true)
    private String nama;
    @Column(length = 30, nullable = true)
    private String warna;
    private String harga;
    
    @OneToMany
    @JoinColumn(name="id_mobil")
    private Set<Aksesoris> id;
    
    public Long getIdMobil() {
        return id_mobil;
    }

    public void setIdMobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
