package com.example.tacgiavanhoc.hugo;

public class TacPham {
    private String tenTp;
    private String tomtat;
    private int soSao;
    private int anh;

    public TacPham(String tenTp, String tomtat, int soSao, int anh) {
        this.tenTp = tenTp;
        this.tomtat = tomtat;
        this.soSao = soSao;
        this.anh = anh;
    }

    public String getTenTp() {
        return tenTp;
    }

    public void setTenTp(String tenTp) {
        this.tenTp = tenTp;
    }

    public String getTomtat() {
        return tomtat;
    }

    public void setTomtat(String tomtat) {
        this.tomtat = tomtat;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public int getSoSao() {
        return soSao;
    }

    public void setSoSao(int soSao) {
        this.soSao = soSao;
    }
}
