public class SolicitudAcuerdo extends Solicitud {
    @Override
    public Documento crearDocumento(){
        return new Acuerdo();
    }
}
