public class CronómetroCósmico {
    private final double diasEnLaTierra;
    private final double diasEnElNuevoPlaneta;
     public CronometroCosmico(double diasEnLaTierra, double diasEnElNuevoPlaneta) {
            this.diasEnLaTierra = diasEnLaTierra;
            this.diasEnElNuevoPlaneta = diasEnElNuevoPlaneta;
        }

    public String convertirTiempo() {
        double segundos = diasEnLaTierra * 86400;
        double minutos = segundos / 60;
        double horas = minutos / 60;
        double dias = horas / 24;
        double años = dias / 365;

    }
