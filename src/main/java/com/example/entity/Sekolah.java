package com.example.entity;

public class Sekolah {
    private Long id;
    private String nama_sekolah;
    private String npsn;
    private String alamat_jalan;
    private String desa;
    private String kecamatan;
    private String kabupaten;
    private String nama_kepala_sekolah;
    private String nip_kepala_sekolah;
    private String nama_guru_pab;
    private String nip_guru_pab;
    private Long user_id;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_sekolah() {
        return nama_sekolah;
    }

    public void setNama_sekolah(String nama_sekolah) {
        this.nama_sekolah = nama_sekolah;
    }

    public String getNpsn() {
        return npsn;
    }

    public void setNpsn(String npsn) {
        this.npsn = npsn;
    }

    public String getAlamat_jalan() {
        return alamat_jalan;
    }

    public void setAlamat_jalan(String alamat_jalan) {
        this.alamat_jalan = alamat_jalan;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getNama_kepala_sekolah() {
        return nama_kepala_sekolah;
    }

    public void setNama_kepala_sekolah(String nama_kepala_sekolah) {
        this.nama_kepala_sekolah = nama_kepala_sekolah;
    }

    public String getNip_kepala_sekolah() {
        return nip_kepala_sekolah;
    }

    public void setNip_kepala_sekolah(String nip_kepala_sekolah) {
        this.nip_kepala_sekolah = nip_kepala_sekolah;
    }

    public String getNama_guru_pab() {
        return nama_guru_pab;
    }

    public void setNama_guru_pab(String nama_guru_pab) {
        this.nama_guru_pab = nama_guru_pab;
    }

    public String getNip_guru_pab() {
        return nip_guru_pab;
    }

    public void setNip_guru_pab(String nip_guru_pab) {
        this.nip_guru_pab = nip_guru_pab;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}