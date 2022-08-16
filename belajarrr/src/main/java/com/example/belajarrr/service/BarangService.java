package com.example.belajarrr.service;

import com.example.belajarrr.model.Barang;
import com.example.belajarrr.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangService {
    @Autowired
    BarangRepository barangRepository;

    public List<Barang> findAllBarang(){
        return barangRepository.findAll();
    }

    public Barang createBarang(Barang barang){
        return barangRepository.save(barang);
    }

    public Barang updateBarang(int id, Barang barang){
        Barang data = barangRepository.findById(id).orElse(new Barang());
        data.setNamaBarang(barang.getNamaBarang() != null ? barang.getNamaBarang() : data.getNamaBarang());
        data.setHarga(barang.getHarga() != null ? barang.getHarga() : data.getHarga());
        data.setStok(barang.getStok() != null ? barang.getStok() : data.getStok());
        data.setSupplier(barang.getSupplier() != null ? barang.getSupplier() : data.getSupplier());
        return barangRepository.save(data);
    }

    public void deleteBarang(int id){
        Barang data = barangRepository.findById(id).orElseThrow(null);
        barangRepository.delete(data);
    }
}
