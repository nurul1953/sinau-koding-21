package com.example.belajarrr.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaksi")
@Setter
@Getter
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_barang")
    private Barang barang;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pembeli")
    private Pembeli pembeli;

    @Transient
    @OneToOne(mappedBy = "transaksi", fetch = FetchType.LAZY)
    private Pembayaran pembayaran;

    @Column(name = "tgl_transaksi")
    private Date tglTransaksi;

    @Column(name = "keterangan")
    private String ket;
}
