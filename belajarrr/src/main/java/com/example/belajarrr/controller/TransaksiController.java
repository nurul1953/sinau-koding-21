package com.example.belajarrr.controller;

import com.example.belajarrr.model.Transaksi;
import com.example.belajarrr.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaksi")
public class TransaksiController {
    @Autowired
    TransaksiService transaksiService;

    @GetMapping
    public ResponseEntity<?> findAllTransaksi(){
        return new ResponseEntity(transaksiService.findAllTransaksi(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveTransaksi(@RequestBody Transaksi transaksi){
        return new ResponseEntity(transaksiService.createTransaksi(transaksi), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTransaksi(@PathVariable Integer id, @RequestBody Transaksi transaksi){
        return new ResponseEntity(transaksiService.updateTransaksi(id, transaksi), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTransaksi(@PathVariable Integer id){
        transaksiService.deleteTransaksi(id);
        return new ResponseEntity("Data berhasil dihapus.", HttpStatus.OK);
    }
}
