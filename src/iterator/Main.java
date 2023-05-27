package iterator;

public class Main {

    public static void main(String[] args) {

     Usuarios usuarios= new Usuarios();

     usuarios.create(new User("Daniela", 25));
     usuarios.create(new User("Camila", 36));
     usuarios.create(new User("Pablo", 17));
     usuarios.create(new User("Rocío", 22));
     usuarios.create(new User("Paco", 41));

     while(usuarios.hasMore()){
         User user = usuarios.next();
         System.out.println(user.getNombre() + " tiene " + user.getEdad() + " años.");
     }

    }
}
