package RestauranteAbsFact;

public abstract class Plato_Fuerte {
    private String Ingredientes;

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        Ingredientes = ingredientes;
    }

    public abstract void Comestible();
}
