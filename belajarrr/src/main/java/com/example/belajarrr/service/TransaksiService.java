package com.example.belajarrr.service;

import com.example.belajarrr.model.Transaksi;
import com.example.belajarrr.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaksiService {
    @Autowired
    TransaksiRepository transaksiRepository;

    public List<Transaksi> findAllTransaksi(){
        return transaksiRepository.findAll();
    }

    public Transaksi createTransaksi(Transaksi transaksi){
        return transaksiRepository.save(transaksi);
    }

    public Transaksi updateTransaksi(int id, Transaksi transaksi){
        Transaksi data = transaksiRepository.findById(id).orElse(new Transaksi());
        data.setKet(transaksi.getKet() != null ? transaksi.getKet() : data.getKet());
        data.setBarang(transaksi.getBarang() != null ? transaksi.getBarang() : data.getBarang());
        data.setPembeli(transaksi.getPembeli() != null ? transaksi.getPembeli() : data.getPembeli());
        data.setTglTransaksi(transaksi.getTglTransaksi() != null ? transaksi.getTglTransaksi() : data.getTglTransaksi());
        return transaksiRepository.save(data);
    }

    public void deleteTransaksi(int id){
        Transaksi data = transaksiRepository.findById(id).orElseThrow(null);
        transaksiRepository.delete(data);
    }
}
