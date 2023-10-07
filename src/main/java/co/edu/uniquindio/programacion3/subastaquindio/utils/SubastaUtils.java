package co.edu.uniquindio.programacion3.subastaquindio.utils;

import co.edu.uniquindio.programacion3.subastaquindio.model.Producto;
import co.edu.uniquindio.programacion3.subastaquindio.model.SubastaQuindio;
import co.edu.uniquindio.programacion3.subastaquindio.model.Usuario;

public class SubastaUtils {

    public static SubastaQuindio inicializarDatos(){
        SubastaQuindio subasta = new SubastaQuindio();
            Producto producto = new Producto();
            producto.setNombreProducto("binario");
            producto.setCodigoUnico("1234");
            producto.setDescripcion("lavadora casi nueva");
            producto.setAnunciante("Carlos Montes");
            producto.setTipoProducto("HOGAR");
            producto.setFechaPublicacion("29-09-2023");
            producto.setFechaFinPublicacion("29-09-2023");
            producto.setValorInicial(45200);
            subasta.getListaProducto().add(producto);
        Usuario usuario = new Usuario();
        usuario.setUsuario("Yovanny");
        usuario.setContrasenia("1978");
        subasta.getListaUsuarios().add(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.setUsuario("Pablo");
        usuario2.setContrasenia("1980");
        subasta.getListaUsuarios().add(usuario2);

            return subasta;



    }
}
