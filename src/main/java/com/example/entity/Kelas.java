package com.example.entity;

import java.time.LocalDateTime;

public class Kelas {
    private Long id;
    private String nama_kelas;
    private Long user_id;
    private LocalDateTime created_at;

    // Constructor
    public Kelas(Long id, String nama_kelas, Long user_id, LocalDateTime created_at) {
        this.id = id;
        this.nama_kelas = nama_kelas;
        this.user_id = user_id;
        this.created_at = created_at;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_kelas() {
        return nama_kelas;
    }

    public void setNama_kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}