package com.example.belajarrr.controller;

import com.example.belajarrr.model.Supplier;
import com.example.belajarrr.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @GetMapping
    public ResponseEntity<?> findAllSupplier(){
        return new ResponseEntity(supplierService.findAllSupplier(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveSupplier(@RequestBody Supplier supplier){
        return new ResponseEntity(supplierService.createSupplier(supplier), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSupplier(@PathVariable Integer id, @RequestBody Supplier supplier){
        return new ResponseEntity(supplierService.updateSupplier(id, supplier), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSupplier(@PathVariable Integer id){
        supplierService.deleteSupplier(id);
        return new ResponseEntity("Data berhasil dihapus.", HttpStatus.OK);
    }
}
