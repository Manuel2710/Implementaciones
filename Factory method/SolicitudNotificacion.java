public class SolicitudNotificacion extends Solicitud {
    @Override
    public Documento crearDocumento(){
        return new Acuerdo();
    }
}
