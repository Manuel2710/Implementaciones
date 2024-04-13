public abstract class Solicitud {
    public Documento solicitar(){
        Documento documento = crearDocumento();
        documento.crear();
        return documento;
    }

    public abstract Documento crearDocumento();
}
