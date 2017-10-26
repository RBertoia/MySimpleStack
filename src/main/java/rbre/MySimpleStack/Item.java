package rbre.MySimpleStack;

/**
 * Created by brr0530a on 26/10/2017.
 */
public class Item {
    private Object value;

    Item (Object value){
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
