package rbre.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.Stack;

/**
 * Created by brr0530a on 26/10/2017.
 * un commentaire répondant à l'exigence #3
 */
public class SimpleStackImpl implements SimpleStack{

    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    public int getSize() {
        return wrappedStack.size();
    }

    public void push(Item item) {
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }


}
