package state;

public class EstadoCamaraAbierta extends Estado{


    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Ya se encuentra desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        return "La cámara ya se encuentra abierta.";
    }

    @Override
    public String tomarFoto() {
        telefono.cambiaEstado(new EstadoTomarFoto(telefono));
        return "La foto se va a dispara ya...";
    }

    @Override
    public String bloquear() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        telefono.setBlock(1);
        return "Se ha bloqueado el celular.";
    }

    @Override
    public String toString() {
        return "Estado -> Cámara abierta";
    }
}
