package jdbc.model;

import java.sql.Date;

public class Reserva {

    private int id;
    private Date checkIn;
    private Date checkOut;
    private double valor;
    private String formaPago;

    public int getId() {
        return id;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public double getValor() {
        return valor;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
}
