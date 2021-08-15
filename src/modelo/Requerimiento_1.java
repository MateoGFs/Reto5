/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mateo
 */
public class Requerimiento_1 {
    private int idProyecto;
    private String constructora;
    private int numeroBancos;
    private int numeroHabitaciones;
    private String acabados;
    private String serial;
    private int idTipo;
    private int idLider;
    private String ciudad;
    private String banco;
    private Double porcentaje;
    private String clasificacion;
    private String fecha;

    public Requerimiento_1() {

    }

    public Requerimiento_1(String constructora, String ciudad, String banco, Double porcentaje, String clasificacion,
            String fecha) {
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.banco = banco;
        this.porcentaje = porcentaje;
        this.clasificacion = clasificacion;
        this.fecha = fecha;
    }

    public Requerimiento_1(int idProyecto, String constructora, int numeroBancos, int numeroHabitaciones, String acabados, String serial, int idTipo, int idLider, String ciudad, String banco, Double porcentaje, String clasificacion, String fecha) {
        this.idProyecto = idProyecto;
        this.constructora = constructora;
        this.numeroBancos = numeroBancos;
        this.numeroHabitaciones = numeroHabitaciones;
        this.acabados = acabados;
        this.serial = serial;
        this.idTipo = idTipo;
        this.idLider = idLider;
        this.ciudad = ciudad;
        this.banco = banco;
        this.porcentaje = porcentaje;
        this.clasificacion = clasificacion;
        this.fecha = fecha;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public int getNumeroBancos() {
        return numeroBancos;
    }

    public void setNumeroBancos(int numeroBancos) {
        this.numeroBancos = numeroBancos;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdLider() {
        return idLider;
    }

    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  

    

    
}
