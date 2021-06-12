package ar.com.susan.webservicespring.entities;

import javax.persistence.*;

@Entity
@Table(name="productos")

public class Producto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    private String codigo_producto;
    private String categoria;
    private String nombre;
    private String descripcion;
    private Double precio_unitario;
    private Integer stock;

    public Producto (){

    }

    public Producto(int id_producto, String nombre, String codigo_producto, String descripcion, String categoria, double precio_unitario, int stock) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.codigo_producto = codigo_producto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio_unitario = precio_unitario;
        this.stock = stock;
    }

    public String getCodigo_producto() {return codigo_producto;}

    public void setCodigo_producto(String codigo_producto) {this.codigo_producto = codigo_producto;}

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", codigo=" + codigo_producto +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio_unitario=" + precio_unitario +
                ", stock=" + stock +
                '}';
    }
}
