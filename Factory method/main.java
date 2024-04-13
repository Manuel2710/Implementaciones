public class main {
    public static void main(String[] args) {
        Solicitud solicitudAcuerdo = new SolicitudAcuerdo();
        Documento acuerdo = solicitudAcuerdo.crearDocumento();

        Solicitud solicitudContrato = new SolicitudContrato();
        Documento contrato = solicitudContrato.crearDocumento();

        Solicitud solicitudNotificacion = new SolicitudNotificacion();
        Documento notificacion = solicitudNotificacion.crearDocumento();
    }
}
