public class Acuerdo implements Documento {
    String Titulo;
    String Cuerpo;
    String Nombre;
    @Override
    public void crear(){
        System.out.println("Creando acuerdo...");
        Titulo = "Acuerdo";
        Cuerpo = "El siguiente es un documento de acuerdo legal";
    }
    @Override
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    @Override
    public void printData(){
        System.out.println("Titulo: " + Titulo);
        System.out.println("Cuerpo: " + Cuerpo);
        System.out.println("Nombre del cliente: " + Nombre);
    }
}
