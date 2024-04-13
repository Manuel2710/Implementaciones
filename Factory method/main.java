public class main {
    public static void main(String[] args) {
        Solicitud solicitudAcuerdo = new SolicitudAcuerdo();
        Documento acuerdo = solicitudAcuerdo.solicitar();

        Solicitud solicitudContrato = new SolicitudContrato();
        Documento contrato = solicitudContrato.solicitar();

        Solicitud solicitudNotificacion = new SolicitudNotificacion();
        Documento notificacion = solicitudNotificacion.solicitar();
    }
}
