package com.example.tacgiavanhoc;

import com.example.tacgiavanhoc.hugo.TacPham;

import java.util.List;

public class TacGia {
    private String ten;
    private int soTacPham;
    private List<TacPham> tacPhams;

    public TacGia(String ten, int soTacPham, List<TacPham> tacPhams) {
        this.ten = ten;
        this.soTacPham = soTacPham;
        this.tacPhams = tacPhams;
    }

    public List<TacPham> getTacPhams() {
        return tacPhams;
    }

    public void setTacPhams(List<TacPham> tacPhams) {
        this.tacPhams = tacPhams;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTacPham() {
        return soTacPham;
    }

    public void setSoTacPham(int soTacPham) {
        this.soTacPham = soTacPham;
    }
}
