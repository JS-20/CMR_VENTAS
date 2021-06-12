package ar.com.susan.webservicespring.service;

import ar.com.susan.webservicespring.entities.Producto;
import ar.com.susan.webservicespring.repositories.ClienteRepository;
import ar.com.susan.webservicespring.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;
@Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    public List<Producto> getProductos(){return productoRepository.findAll();}
    public Producto buscarProducto(Integer id_producto){return productoRepository.findById(id_producto).orElse(null);}

}
