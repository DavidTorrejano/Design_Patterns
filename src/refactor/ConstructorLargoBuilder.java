package refactor;

public class ConstructorLargoBuilder {
    private String nombre;
    private String apellido;
    private int identidad;
    private String profesion;
    private String hobbie;

    private ConstructorLargoBuilder(){}

    public ConstructorLargoBuilder(String nombre){
        this.nombre = nombre;
    }
    public ConstructorLargoBuilder apellido(String apellido){
        this.apellido = apellido;
        return this;
    }
    public ConstructorLargoBuilder identidad(int identidad){
        this.identidad = identidad;
        return this;
    }
    public ConstructorLargoBuilder profesion(String profesion){
        this.profesion = profesion;
        return this;
    }
    public ConstructorLargoBuilder hobbie(String hobbie){
        this.hobbie = hobbie;
        return this;
    }

}
