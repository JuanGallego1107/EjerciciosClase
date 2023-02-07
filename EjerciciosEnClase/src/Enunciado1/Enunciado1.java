package Enunciado1;

import java.util.Date;

public class Enunciado1 {
    private String name;
    private String lastname;
    private String genero;
    private Date birthDate;
    private Date admissionDate;
    private int basicSalary;
    private int antiguedad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int prestaciones(){
        return (getAntiguedad()*getBasicSalary())/12;
    }
    public String mostrarMensaje(){
        return "Nombre: "+getName()+"\n Apellido: "+getLastname()+"\n Genero: "+getGenero()+"\n Antiguedad: "+getAntiguedad()+"\n Prestaciones: "+prestaciones();
    }
}
