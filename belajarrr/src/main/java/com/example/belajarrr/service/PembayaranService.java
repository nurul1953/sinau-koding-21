package com.example.belajarrr.service;

import com.example.belajarrr.model.Pembayaran;
import com.example.belajarrr.repository.PembayaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembayaranService {
    @Autowired
    PembayaranRepository pembayaranRepository;

    public List<Pembayaran> findAllPembayaran(){
        return pembayaranRepository.findAll();
    }

    public Pembayaran createPembayaran(Pembayaran pembayaran){
        return pembayaranRepository.save(pembayaran);
    }

    public Pembayaran updatePembayaran(int id, Pembayaran pembayaran){
        Pembayaran data = pembayaranRepository.findById(id).orElse(new Pembayaran());
        data.setTglBayar(pembayaran.getTglBayar() != null ? pembayaran.getTglBayar() : data.getTglBayar());
        data.setTotal(pembayaran.getTotal() != null ? pembayaran.getTotal() : data.getTotal());
        data.setTransaksi(pembayaran.getTransaksi() != null ? pembayaran.getTransaksi() : data.getTransaksi());
        return pembayaranRepository.save(data);
    }

    public void deletePembayaran(int id){
        Pembayaran data = pembayaranRepository.findById(id).orElseThrow(null);
        pembayaranRepository.delete(data);
    }
}
