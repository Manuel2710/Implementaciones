public class App {
    public static void main(String[] args) {

        // Crear un prototipo de botella
        PrototipoBotella botellaSprite = new BotellaSprite(500, "plástico", "transparente", "Sprite", 1, "cónica");

        // Clonar el prototipo
        PrototipoBotella botellaSpriteClonada = botellaSprite.clonar();

        // Imprimir los datos de la botella clonada
        System.out.println("Datos de la botella clonada:");
        printBotellaData((Botella) botellaSpriteClonada);

        System.out.println("\nDatos de la botella original:");
        printBotellaData((Botella) botellaSprite);

        // Imprimir las referencias de las botellas
        System.out.println("\nReferencia de la botella original: " + botellaSprite);
        System.out.println("Referencia de la botella clonada: " + botellaSpriteClonada);
    }

    private static void printBotellaData (Botella botella) {
        System.out.println("Capacidad: " + botella.getCapacidad());
        System.out.println("Material: " + botella.getMaterial());
        System.out.println("Color: " + botella.getColor());
        System.out.println("Etiqueta: " + botella.getEtiqueta());
        System.out.println("Tipo de tapa: " + botella.getTipoTapa());
        System.out.println("Forma: " + botella.getForma());
    }
}
