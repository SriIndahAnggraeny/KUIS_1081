/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1081.repo;

/**
 *
 * @author PC320-10
 */
import com.tib.kuis_1081.entity.Aksesoris;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AksesorisRepo {
    @Query("select c from Member c")
    public List<Aksesoris> findAllAksesoris();

    public Aksesoris save(Aksesoris aksesoris);

    public void delete(Long id);

    public Aksesoris findOne(Long id);
}
