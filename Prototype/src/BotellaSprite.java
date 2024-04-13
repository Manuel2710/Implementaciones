public class BotellaSprite extends Botella implements PrototipoBotella{

    public BotellaSprite(int capacidad, String material, String color, String etiqueta, int tipoTapa, String forma) {
        super(capacidad, material, color, etiqueta, tipoTapa, forma);
    }

    @Override
    public PrototipoBotella clonar() {
        return new BotellaSprite(this.getCapacidad(), this.getMaterial(), this.getColor(), this.getEtiqueta(),
                this.getTipoTapa(), this.getForma());
    }
}
