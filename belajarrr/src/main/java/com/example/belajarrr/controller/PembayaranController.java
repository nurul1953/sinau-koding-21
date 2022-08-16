package com.example.belajarrr.controller;

import com.example.belajarrr.model.Pembayaran;
import com.example.belajarrr.service.PembayaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pembayaran")
public class PembayaranController {
    @Autowired
    PembayaranService pembayaranService;

    @GetMapping
    public ResponseEntity<?> findAllPembayaran(){
        return new ResponseEntity(pembayaranService.findAllPembayaran(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> savePembayaran(@RequestBody Pembayaran pembayaran){
        return new ResponseEntity(pembayaranService.createPembayaran(pembayaran), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePembayaran(@PathVariable Integer id, @RequestBody Pembayaran pembayaran){
        return new ResponseEntity(pembayaranService.updatePembayaran(id, pembayaran), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePembayaran(@PathVariable Integer id){
        pembayaranService.deletePembayaran(id);
        return new ResponseEntity("Data berhasil dihapus.", HttpStatus.OK);
    }
}
