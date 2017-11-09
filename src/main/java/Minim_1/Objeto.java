package Minim_1;

public class Objeto
{
    String nombre;
    String descripcion;

    public Objeto(String nombre,String descripcion)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

}
