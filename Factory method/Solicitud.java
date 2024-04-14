public abstract class Solicitud {
    public Documento solicitar(){
        Documento documento = crearDocumento();
        documento.crear();
        //mostrar args
        //for (String arg : args) {
        //    System.out.println(arg);
        //}
        return documento;
    }

    public abstract Documento crearDocumento();
}
