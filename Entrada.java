package RestauranteAbsFact;

public abstract class Entrada {
    private String Ingredientes;

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        Ingredientes = ingredientes;
    }

    public abstract void Comestible();
}
