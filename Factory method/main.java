import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese el nombre del documento: ");
        String nombre = (lectura.next()).toLowerCase();

        if ("acuerdo".equals(nombre)){
            Solicitud solicitudAcuerdo = new SolicitudAcuerdo();
            Documento documento = solicitudAcuerdo.solicitar();
        } else if ("contrato".equals(nombre)){
            Solicitud solicitudContrato = new SolicitudContrato();
            Documento documento = solicitudContrato.solicitar();
        } else if ("solicitud".equals(nombre)){

            Solicitud solicitudNotificacion = new SolicitudNotificacion();
            Documento documento = solicitudNotificacion.solicitar();
        }
    }
}
