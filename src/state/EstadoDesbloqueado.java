package state;

public class EstadoDesbloqueado extends Estado{


    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "El celular ya se encuentra desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "La cámara a sido abierta con éxito.";
    }

    @Override
    public String tomarFoto() {
        return "No se puede tomar la foto, primero debe abir la cámara.";
    }

    @Override
    public String bloquear() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "Se ha bloqueado el celular con éxito";
    }

    @Override
    public String toString() {
        return "Estado -> Desbloqueado";
    }
}