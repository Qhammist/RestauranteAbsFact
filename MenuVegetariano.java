package RestauranteAbsFact;

public class MenuVegetariano extends Menu {

    @Override
    public Entrada crearEntrada() {
       return new EntradaVegetariana();
    }

    @Override
    public Plato_Fuerte crearPlatoFuerte() {
        return new Plato_FuerteVegetariano();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegetariano();
    }

    @Override
    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }
    
}
