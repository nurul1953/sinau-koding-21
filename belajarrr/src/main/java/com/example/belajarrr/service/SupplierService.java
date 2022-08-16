package com.example.belajarrr.service;

import com.example.belajarrr.model.Supplier;
import com.example.belajarrr.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    SupplierRepository supplierRepository;

    public List<Supplier> findAllSupplier(){
        return supplierRepository.findAll();
    }

    public Supplier createSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }

    public Supplier updateSupplier(int id, Supplier supplier){
        Supplier data = supplierRepository.findById(id).orElse(new Supplier());
        data.setNamaSupplier(supplier.getNamaSupplier() != null ? supplier.getNamaSupplier() : data.getNamaSupplier());
        data.setNoTelp(supplier.getNoTelp() != null ? supplier.getNoTelp() : data.getNoTelp());
        data.setAlamat(supplier.getAlamat() != null ? supplier.getAlamat() : data.getAlamat());
        return supplierRepository.save(data);
    }

    public void deleteSupplier(int id){
        Supplier data = supplierRepository.findById(id).orElseThrow(null);
        supplierRepository.delete(data);
    }
}
