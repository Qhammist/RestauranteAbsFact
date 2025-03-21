package RestauranteAbsFact;

public class Main {
        public static void main(String[] args) {
            Comensal comensal;
            comensal = new Comensal(new MenuVegetariano());
            comensal.Ordenar();
        }
}
