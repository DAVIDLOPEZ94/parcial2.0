public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean observable;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.observable = observable;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Distancia al Sol: " + distanciaAlSol);
        System.out.println("Observable: " + (observable ? "Sí" : "No"));
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 108.321e10, 12742, 149.6e6, true);

        tierra.imprimirInformacion();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad());
    }
}
