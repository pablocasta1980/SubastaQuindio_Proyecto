package co.edu.uniquindio.programacion3.subastaquindio.model.service;

import co.edu.uniquindio.programacion3.subastaquindio.exceptions.ProductoException;
import co.edu.uniquindio.programacion3.subastaquindio.model.Producto;

import java.util.ArrayList;

public interface ISubastaQuindioService {

    Producto crearProducto(String codigoUnico, String nombreProducto, String descripcion, String tipoProducto,
                           String foto, String nombreAnunciante, String fechaPublicacion, String fechaFinPublicacion,
                           Double valorInicial) throws ProductoException;

    boolean actualizarProducto(String codigoActual, Producto producto) throws ProductoException;

    Boolean eliminarProducto(String codigoUnico) throws ProductoException;

    boolean verificarProductoExistente(String codigoUnico) throws ProductoException;

    Producto obtenerProducto(String codigoUnico);

    ArrayList<Producto> obtenerProducto();

    boolean usuarioExiste(String nombreUsuario, String password);
}