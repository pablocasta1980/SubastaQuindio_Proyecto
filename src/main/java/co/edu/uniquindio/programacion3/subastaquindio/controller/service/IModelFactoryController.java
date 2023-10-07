package co.edu.uniquindio.programacion3.subastaquindio.controller.service;

import co.edu.uniquindio.programacion3.subastaquindio.mapping.dto.ProductoDTO;

import java.util.List;

public interface IModelFactoryController {

    List<ProductoDTO> obtenerProductos();

    boolean agregarProducto(ProductoDTO productoDTO);

    boolean eliminarProducto(String codigoUnico);

    boolean actualizarProducto(String codigoUnico, ProductoDTO productoDto );
}
