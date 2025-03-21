package RestauranteAbsFact;

public abstract class Menu {
    public abstract Entrada crearEntrada();
    public abstract Plato_Fuerte crearPlatoFuerte();
    public abstract Postre crearPostre();
    public abstract Bebida crearBebida();
}