package rbre.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by brr0530a on 26/10/2017.
 */
public interface SimpleStack {
    public boolean isEmpty();
    public int getSize();
    public void push(Item item);
    public Item peek() throws EmptyStackException;
    public Item pop() throws EmptyStackException;
}
