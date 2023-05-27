package state;

public class EstadoTomarFoto extends Estado{


    public EstadoTomarFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Ya se encuentra desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        return "La cámara se encuentra ya abierta.";
    }

    @Override
    public String tomarFoto() {
        telefono.setBlock(0);
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "La foto ha sido tomada.\nFin del proceso.";
    }

    @Override
    public String bloquear() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        telefono.setBlock(1);
        return "Se ha bloqueado el celular.";
    }

    @Override
    public String toString() {
        return "Estado -> Foto ha sido tomada.";
    }
}