package resepmakanan.resepmakanan;

/**
 * Created by Agung Nur Pratama A11.2014.08459 on 10/11/2017.
 * Razormangs
 */

public class Resep {
    private String judul, summary, resep, gambar;

    public Resep(String judul, String summary, String resep, String gambar) {
        this.judul = judul;
        this.summary = summary;
        this.resep = resep;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) {
        this.resep = resep;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}

