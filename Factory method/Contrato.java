public class Contrato implements Documento {
    String Titulo;
    String Cuerpo;
    String Nombre;
    @Override
    public void crear(){
        System.out.println("Creando contrato...");
        Titulo = "Contrato";
        Cuerpo = "El siguiente es un documento de contrato legal";
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
