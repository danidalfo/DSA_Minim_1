package Minim_1;

import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;


public class EtakemonManagerImpl
{

    final static Logger logger = Logger.getLogger(EtakemonManagerImpl.class);

    private static EtakemonManagerImpl instance = null;

    private HashMap<String,Usuario> listaUsuarios;

    protected EtakemonManagerImpl ()
    {
        listaUsuarios = new HashMap<String,Usuario>();
    }

    public static EtakemonManagerImpl getInstance()
    {


        if(instance == null)
        {
            instance = new EtakemonManagerImpl();
        }
        return instance;
    }
    public Boolean crearUsuario(Usuario usuario) {

        logger.info("Crear usuario"+usuario);

        Usuario a = listaUsuarios.get(Usuario.nombre)NO HO ENTENC
        if (a == null) {
            listaUsuarios.put(Usuario.nombre, usuario);
            return true;
        } else return false;

    }
}
