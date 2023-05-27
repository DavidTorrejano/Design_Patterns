package state;

public class Telefono {

    public Estado estado;
    private int block = 0;

    public Telefono (){
        estado = new EstadoBloqueado(this);
    }

    public void cambiaEstado(Estado estado){
        //System.out.println("Estado inicial: " + this.getEstado());
        this.estado = estado;
        //System.out.println("Estado final: " + this.getEstado());
    }

    public Estado getEstado(){
        return estado;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getBlock(){
        return block;
    }
}
