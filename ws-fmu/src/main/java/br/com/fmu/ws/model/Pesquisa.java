package br.com.fmu.ws.model;

import javax.persistence.*;

/**
 * Created by wallace on 29/04/16.
 */

@Entity
@Table(name = "tb_pesquisa")
public class Pesquisa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ra;
    private String imei;
    private String longitude;
    private String latitude;
    private String codPalestra;
    private String periodoPalestra;
    private int diaPalestra;
    private String tipoEvento;
    private int idPergunta1;
    private int notaPergunta1;
    private int idPergunta2;
    private int notaPergunta2;
    private int idPergunta3;
    private int notaPergunta3;
    private int idPergunta4;
    private int notaPergunta4;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCodPalestra() {
        return codPalestra;
    }

    public void setCodPalestra(String codPalestra) {
        this.codPalestra = codPalestra;
    }

    public String getPeriodoPalestra() {
        return periodoPalestra;
    }

    public void setPeriodoPalestra(String periodoPalestra) {
        this.periodoPalestra = periodoPalestra;
    }

    public int getDiaPalestra() {
        return diaPalestra;
    }

    public void setDiaPalestra(int diaPalestra) {
        this.diaPalestra = diaPalestra;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getIdPergunta1() {
        return idPergunta1;
    }

    public void setIdPergunta1(int idPergunta1) {
        this.idPergunta1 = idPergunta1;
    }

    public int getNotaPergunta1() {
        return notaPergunta1;
    }

    public void setNotaPergunta1(int notaPergunta1) {
        this.notaPergunta1 = notaPergunta1;
    }

    public int getIdPergunta2() {
        return idPergunta2;
    }

    public void setIdPergunta2(int idPergunta2) {
        this.idPergunta2 = idPergunta2;
    }

    public int getNotaPergunta2() {
        return notaPergunta2;
    }

    public void setNotaPergunta2(int notaPergunta2) {
        this.notaPergunta2 = notaPergunta2;
    }

    public int getIdPergunta3() {
        return idPergunta3;
    }

    public void setIdPergunta3(int idPergunta3) {
        this.idPergunta3 = idPergunta3;
    }

    public int getNotaPergunta3() {
        return notaPergunta3;
    }

    public void setNotaPergunta3(int notaPergunta3) {
        this.notaPergunta3 = notaPergunta3;
    }

    public int getIdPergunta4() {
        return idPergunta4;
    }

    public void setIdPergunta4(int idPergunta4) {
        this.idPergunta4 = idPergunta4;
    }

    public int getNotaPergunta4() {
        return notaPergunta4;
    }

    public void setNotaPergunta4(int notaPergunta4) {
        this.notaPergunta4 = notaPergunta4;
    }

    @Override
    public String toString() {
        return "Pesquisa{" +
                "id=" + id +
                ", ra='" + ra + '\'' +
                ", imei='" + imei + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", codPalestra='" + codPalestra + '\'' +
                ", periodoPalestra='" + periodoPalestra + '\'' +
                ", diaPalestra=" + diaPalestra +
                ", tipoEvento='" + tipoEvento + '\'' +
                ", idPergunta1=" + idPergunta1 +
                ", notaPergunta1=" + notaPergunta1 +
                ", idPergunta2=" + idPergunta2 +
                ", notaPergunta2=" + notaPergunta2 +
                ", idPergunta3=" + idPergunta3 +
                ", notaPergunta3=" + notaPergunta3 +
                ", idPergunta4=" + idPergunta4 +
                ", notaPergunta4=" + notaPergunta4 +
                '}';
    }
}
