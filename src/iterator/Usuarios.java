package iterator;

import java.util.ArrayList;
import java.util.List;

public class Usuarios implements UsuarioIterator{

    private ArrayList <User> users= new ArrayList<>();
    private int position= 0;

    public void create(User user){
        users.add(user);
    }

    @Override
    public User next() {
        User user = users.get(position);
        ++position;
        return user;
    }

    @Override
    public void reset() {
        position= 0;
    }

    @Override
    public boolean hasMore() {
        return position < users.size();
    }

}
