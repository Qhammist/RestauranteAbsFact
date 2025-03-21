package RestauranteAbsFact;

public class Comensal {
    private Menu menu;
    private Entrada entrada;
    private Plato_Fuerte platoFuerte;
    private Postre postre;
    private Bebida bebida;

    public Comensal(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void Ordenar() {
        System.out.println("Ordenando...");
        entrada=menu.crearEntrada();
        platoFuerte=menu.crearPlatoFuerte();
        postre=menu.crearPostre();
        bebida=menu.crearBebida();
        System.out.println("Orden completada");
        entrada.Comestible();
        platoFuerte.Comestible();
        postre.Comestible();
        bebida.Bebible();
    }

    public void crearMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearMenu'");
    }
    
}
