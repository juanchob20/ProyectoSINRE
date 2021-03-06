package entity;
// Generated 22/11/2017 08:55:53 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name="PERSONA"
    ,schema="ADMIN_PROYECTOSINRE"
)
public class Persona  implements java.io.Serializable {


     private BigDecimal idPersona;
     private String numDocumento;
     private String correo;
     private String direccion;
     private String tipoDocumento;
     private String telefono;
     private String apellido;
     private String genero;
     private String nombre;
     private Date fechaNaciomiento;
     private String usuario;
     private String contrasena;
     private Set<Vehiculo> vehiculos = new HashSet<Vehiculo>(0);
     private Set<Elemento> elementos = new HashSet<Elemento>(0);
     private Instructor instructor;
     private Administrador administrador;
     private Aprendiz aprendiz;
     private Vigilante vigilante;

    public Persona() {
    }

	
    public Persona(BigDecimal idPersona, String numDocumento) {
        this.idPersona = idPersona;
        this.numDocumento = numDocumento;
    }
    public Persona(BigDecimal idPersona, String numDocumento, String correo, String direccion, String tipoDocumento, String telefono, String apellido, String genero, String nombre, Date fechaNaciomiento, String usuario, String contrasena, Set<Vehiculo> vehiculos, Set<Elemento> elementos, Instructor instructor, Administrador administrador, Aprendiz aprendiz, Vigilante vigilante) {
       this.idPersona = idPersona;
       this.numDocumento = numDocumento;
       this.correo = correo;
       this.direccion = direccion;
       this.tipoDocumento = tipoDocumento;
       this.telefono = telefono;
       this.apellido = apellido;
       this.genero = genero;
       this.nombre = nombre;
       this.fechaNaciomiento = fechaNaciomiento;
       this.usuario = usuario;
       this.contrasena = contrasena;
       this.vehiculos = vehiculos;
       this.elementos = elementos;
       this.instructor = instructor;
       this.administrador = administrador;
       this.aprendiz = aprendiz;
       this.vigilante = vigilante;
    }
   
     @Id 

    
    @Column(name="ID_PERSONA", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(BigDecimal idPersona) {
        this.idPersona = idPersona;
    }

    
    @Column(name="NUM_DOCUMENTO", nullable=false, length=30)
    public String getNumDocumento() {
        return this.numDocumento;
    }
    
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    
    @Column(name="CORREO", length=30)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    @Column(name="DIRECCION", length=30)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="TIPO_DOCUMENTO", length=30)
    public String getTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    
    @Column(name="TELEFONO", length=0)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="APELLIDO", length=30)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Column(name="GENERO", length=30)
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    @Column(name="NOMBRE", length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_NACIOMIENTO", length=7)
    public Date getFechaNaciomiento() {
        return this.fechaNaciomiento;
    }
    
    public void setFechaNaciomiento(Date fechaNaciomiento) {
        this.fechaNaciomiento = fechaNaciomiento;
    }

    
    @Column(name="USUARIO", length=30)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="CONTRASENA", length=30)
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Set<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Elemento> getElementos() {
        return this.elementos;
    }
    
    public void setElementos(Set<Elemento> elementos) {
        this.elementos = elementos;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="persona")
    public Instructor getInstructor() {
        return this.instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="persona")
    public Administrador getAdministrador() {
        return this.administrador;
    }
    
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="persona")
    public Aprendiz getAprendiz() {
        return this.aprendiz;
    }
    
    public void setAprendiz(Aprendiz aprendiz) {
        this.aprendiz = aprendiz;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="persona")
    public Vigilante getVigilante() {
        return this.vigilante;
    }
    
    public void setVigilante(Vigilante vigilante) {
        this.vigilante = vigilante;
    }




}


