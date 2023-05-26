
package Template_Methods.D2_LopHoc;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectDB<T> {
    List<T> list = new ArrayList<>();
    
    public abstract int getId(T t);
    
    T findByID(int id){
        for(var t: list){
            if(getId(t)== id)
                return t;
        }
        return null;
    }
    
    public boolean add(T t){
        for(var o: list){
            if(getId(t) == getId(o))
                return false;
        }
        list.add(t);
        return true;
    }
    
    public int update(T t){
        for(int i=0; i<list.size();i++){
            if(getId(list.get(i))==getId(t))
                list.set(i, t);
                return 1;
        }
        return 0;
    }
    public  int delete(T t){
        for (var o : list){
            if (getId(t) == getId(o)) {
                list.remove(o);
                return 1;
            }
        }
        return 0;
    }
    
    public int deleteByID(int id){
        for(var t: list){
            if(getId(t)==id)
                list.remove(t);
                return 1;
        }
        return 0;
    }
}
