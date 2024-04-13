public class SolicitudContrato extends Solicitud {
    @Override
    public Documento crearDocumento(){
        return new Acuerdo();
    }
}
