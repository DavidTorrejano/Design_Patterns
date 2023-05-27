package strategy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Usuarios usFic;
        int tipUs= 1;

        if (tipUs == 0){
            usFic = new UsuariosFichero();
        }else{
            usFic = new UsuariosMemoria();
        }

        crear(usFic, "Pedro");
        crear(usFic, "Lola");
        crear(usFic, "Mario");
        crear(usFic, "Mariana");
        crear(usFic, "Lorena");


        for (String usu: listar(usFic)){
            System.out.println(usu);
        }
    }

    public static void crear(Usuarios usuario, String nombre){
        usuario.crear(nombre);
    }

    public static ArrayList <String> listar (Usuarios usuario){
        return usuario.listar();
    }

}
