package com.example.belajarrr.service;

import com.example.belajarrr.model.Pembeli;
import com.example.belajarrr.repository.PembeliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembeliService {
    @Autowired
    PembeliRepository pembeliRepository;

    public List<Pembeli> findAllPembeli(){
        return pembeliRepository.findAll();
    }

    public Pembeli createPembeli(Pembeli pembeli){
        return pembeliRepository.save(pembeli);
    }

    public Pembeli updatePembeli(int id, Pembeli pembeli){
        Pembeli data = pembeliRepository.findById(id).orElse(new Pembeli());
        data.setNamaPembeli(pembeli.getNamaPembeli() != null ? pembeli.getNamaPembeli() : data.getNamaPembeli());
        data.setNoTelp(pembeli.getNoTelp() != null ? pembeli.getNoTelp() : data.getNoTelp());
        data.setAlamat(pembeli.getAlamat() != null ? pembeli.getAlamat() : data.getAlamat());
        return pembeliRepository.save(data);
    }

    public void deletePembeli(int id){
        Pembeli data = pembeliRepository.findById(id).orElseThrow(null);
        pembeliRepository.delete(data);
    }
}
