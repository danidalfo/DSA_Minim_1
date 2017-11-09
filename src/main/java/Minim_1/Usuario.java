package Minim_1;

import java.util.List;

public class Usuario {

    public static String nombre;
    public static String password;
    List<Objeto> ObjetosUsuario;

    public Usuario() {
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public static String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void añadirObjeto(Objeto ob) {
        ObjetosUsuario.add(ob);
    }

    public List<Objeto> getObjetosUsuario() {
        return ObjetosUsuario;
    }


}




