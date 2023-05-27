package state;

public class EstadoBloqueado extends Estado{


    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        if (telefono.getBlock()==0) {
            telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
            return "El celular se encuentra ahora desbloqueado.";
        }else{
            telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
            return "Listo para tomar una foto.";
        }
    }

    @Override
    public String abrirCamara() {
        return "La cámara está bloqueada, primero desbloquee el celular.";
    }

    @Override
    public String tomarFoto() {
        return "No se puede tomar foto con el celular bloqueado.";
    }

    @Override
    public String bloquear() {
        return "El celular se encuentra ya bloqueado";
    }

    @Override
    public String toString() {
        return "Estado -> Bloqueado";
    }


}
