package strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios{
    private final String RUTA = "usuarios.txt";
    private PrintStream fichero;

    public UsuariosFichero(){
        try{
            fichero = new PrintStream(RUTA);
        }catch (FileNotFoundException e){
            System.out.println("No encontramos la ruta: " + e.getMessage());
        }
    }

    @Override
    public void crear(String nombre){
        fichero.println(nombre);
    }

    @Override
    public ArrayList <String> listar(){
        ArrayList<String> nombres = new ArrayList<>();

        try {
            Scanner scanner= new Scanner(new File(RUTA));

            while(scanner.hasNext()){
                nombres.add(scanner.next());
            }
            scanner.close();

        }catch (Exception e){
            System.out.println("Algo salió mal: " + e.getMessage());
        }

        return nombres;
    }
}
