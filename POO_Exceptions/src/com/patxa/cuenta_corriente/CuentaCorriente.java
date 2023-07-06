package com.patxa.cuenta_corriente;

import java.util.Objects;

public class CuentaCorriente {


    private String nCuenta;
    private double saldo;
    private String nombre;
    private String apellido;
    private boolean premium;//En este tipo de cuenta las tranferencias son gratuitas y el banco nos va a permitir saldos negativos
    private double comision;


    ///////////////////////////////////////


    public CuentaCorriente(String nCuenta, double saldo, String nombre, String apellido, boolean premium) {
        this.nCuenta = nCuenta;
        this.saldo = saldo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.premium = premium;

        if (this.premium) {

            this.comision = 0.0;

        } else {

            this.comision = 5.0;
        }

    }

    //////////////////////////////////////////


    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }


    /////////////////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaCorriente that = (CuentaCorriente) o;
        return Objects.equals(nCuenta, that.nCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nCuenta);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "nCuenta='" + nCuenta + '\'' +
                ", saldo=" + saldo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", premium=" + premium +
                ", comision=" + comision +
                '}';
    }


}
