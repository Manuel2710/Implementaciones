public abstract class Solicitud {
    public Documento solicitar(String nombre){
        Documento documento = crearDocumento();
        documento.crear();
        return documento;
    }

    public abstract Documento crearDocumento();
}
