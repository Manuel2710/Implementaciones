public abstract class Botella {
    private int capacidad;
    private String material;
    private String color;
    private String etiqueta;
    private int tipoTapa;
    private String forma;

    // Constructor
    public Botella(int capacidad, String material, String color, String etiqueta, int tipoTapa, String forma) {
        this.capacidad = capacidad;
        this.material = material;
        this.color = color;
        this.etiqueta = etiqueta;
        this.tipoTapa = tipoTapa;
        this.forma = forma;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getTipoTapa() {
        return tipoTapa;
    }

    public void setTipoTapa(int tipoTapa) {
        this.tipoTapa = tipoTapa;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    
}
