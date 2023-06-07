package Stack.Entities;


import java.util.EmptyStackException;

public interface MyStack<T> {

    void push(T value);

    T pop() throws EmptyStackException;

    T peek();

    int size();
    void printStack();
    void clearStack();


}
