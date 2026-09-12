import java.util.ArrayList;
import java.util.List;
public class HubCentral {
    List<DispositivoInteligente> dispositivos;

    public HubCentral() {
        this.dispositivos = new ArrayList<>();
    }

    void agregarDispositivo(DispositivoInteligente dispositivo) {
        dispositivo.add(dispositivo);
        System.out.println("Dispositivo agregado al Hub: " + dispositivo.nombre);
    }

    public void activarModoNoche() {
        System.out.println("\n--- ACTIVANDO MODO NOCHE ---");
        for (DispositivoInteligente d : dispositivos) {
            if (d.isConectado()) {
                System.out.println("Procesando " + d.nombre + "...");
                d.apagar();
            }
            System.out.println("--- MODO NOCHE ACTIVADO ---\n");
        }
    }
}

