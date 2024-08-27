package icc.clases;

public class Ciudadano {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNacimiento;

    public Ciudadano(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento){
	    this.nombre = nombre;
	    this.apellidoPaterno = apellidoPaterno;
	    this.apellidoMaterno = apellidoMaterno;
	    this.fechaNacimiento = fechaNacimiento;
    }

    public String calculaRFC(){
	String rfc = "" + apellidoPaterno.charAt(0) + apellidoPaterno.charAt(1) + apellidoMaterno.charAt(0) + nombre.charAt(0);
	rfc += fechaNacimiento.substring(8,10) + fechaNacimiento.substring(3,5) + fechaNacimiento.substring(0,2);
	    return rfc.toUpperCase();
    }
    public String toString(){
	return "Ciudadano [Nombre: " + nombre + ",apellido Paterno: " + apellidoPaterno + ",apellido Materno: " + apellidoMaterno + ",fecha Nacimiento: " + fechaNacimiento + "]";
    }
}
