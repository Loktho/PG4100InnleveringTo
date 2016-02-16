package no.westerdals.student.loktho14.PG4100.socketInnlevering;

/**
 * Created by Thorstein on 10.02.2016.
 */

public class Bok {
    private String forfatter;
    private String tittel;
    private String isbn;
    private int sider;
    private int utgitt;

    public Bok(String forfatter, String tittel, String isbn, int sider, int utgitt){
        setForfatter(forfatter);
        setTittel(tittel);
        setIsbn(isbn);
        setSider(sider);
        setUtgitt(utgitt);
    }

    public String getForfatter() {
        return forfatter;
    }

    public String getTittel() {
        return tittel;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getSider() {
        return sider;
    }

    public int getUtgitt() {
        return utgitt;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setSider(int sider) {
        this.sider = sider;
    }

    public void setUtgitt(int utgitt) {
        this.utgitt = utgitt;
    }

    @Override
    public String toString() {
        return "Bok{" +
                "forfatter='" + forfatter + '\'' +
                ", tittel='" + tittel + '\'' +
                ", isbn='" + isbn + '\'' +
                ", sider=" + sider +
                ", utgitt=" + utgitt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bok bok = (Bok) o;

        return isbn != null ? isbn.equals(bok.isbn) : bok.isbn == null;

    }

    @Override
    public int hashCode() {
        return isbn != null ? isbn.hashCode() : 0;
    }
}