package com.example.belajarrr.controller;

import com.example.belajarrr.model.Barang;
import com.example.belajarrr.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/barang")
public class BarangController {
    @Autowired
    BarangService barangService;

    @GetMapping
    public ResponseEntity<?> findAllBarang(){
        return new ResponseEntity(barangService.findAllBarang(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveBarang(@RequestBody Barang barang){
        return new ResponseEntity(barangService.createBarang(barang), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBarang(@PathVariable Integer id, @RequestBody Barang barang){
        return new ResponseEntity(barangService.updateBarang(id, barang), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBarang(@PathVariable Integer id){
        barangService.deleteBarang(id);
        return new ResponseEntity("Data berhasil dihapus.", HttpStatus.OK);
    }
}
