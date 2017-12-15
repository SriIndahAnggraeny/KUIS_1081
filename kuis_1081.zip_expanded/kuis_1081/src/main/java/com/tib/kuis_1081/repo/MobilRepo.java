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
import com.tib.kuis_1081.entity.Mobil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MobilRepo {
    @Query("select c from Member c")
    public List<Mobil> findAllMobil();

    public Mobil save(Mobil mobil);

    public void delete(Long id);

    public Mobil findOne(Long id);
}
