class DispositivoInteligente {
    String nombre;
    boolean encendido;
    boolean concetado;

    public DispositivoInteligente(String nombre, boolean conectado){
        this.nombre = nombre;
        this.encendido = false;
        this.concetado = conectado;
    }

    void encender(){
        this.encendido = true;
        System.out.println(nombre + " encendido");
    }

    void apagar(){
        this.encendido = false;
        System.out.println(nombre + " apagado ");
    }

void configurar(String parametro){
       System.out.println("Dispositivo configurado a: " + parametro);
}


    public boolean isConectado() {
        return false;
    }

    public void add(DispositivoInteligente dispositivo) {
    }
}

