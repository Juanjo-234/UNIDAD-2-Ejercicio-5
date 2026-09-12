//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    HubCentral miHub = new HubCentral();

DispositivoInteligente sala = new DispositivoInteligente("Sala", true);
DispositivoInteligente habiatacion  = new DispositivoInteligente("Habiatcion", false);
DispositivoInteligente garaje = new DispositivoInteligente("Garaje", true);

System.out.println("Registrando dispositivos");
miHub.agregarDispositivo(sala);
miHub.agregarDispositivo(habiatacion);
miHub.agregarDispositivo(garaje);

miHub.activarModoNoche();


}
