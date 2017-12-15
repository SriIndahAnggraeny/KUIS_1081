/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1081.service;

/**
 *
 * @author PC320-10
 */
import com.tib.kuis_1081.entity.Aksesoris;
import com.tib.kuis_1081.repo.AksesorisRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("aksesorisService")
@Transactional

public class AksesorisService {
    @Autowired
    private AksesorisRepo repo;

    public Aksesoris insert(Aksesoris aksesoris) {
        return repo.save(aksesoris);
    }
    
    public Aksesoris update(Aksesoris aksesoris) {
        return repo.save(aksesoris);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Aksesoris getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Aksesoris> getAll(){
        return repo.findAllAksesoris();
    }
}
