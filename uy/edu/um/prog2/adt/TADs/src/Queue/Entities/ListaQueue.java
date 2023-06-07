package Queue.Entities;

import Queue.exceptions.EmptyQueueException;
import Queue.exceptions.NoExiste;

public interface ListaQueue<Tipo> {
    void add(Tipo value);
    void remove(int position) throws EmptyQueueException;
    Tipo get(int position) throws NoExiste, EmptyQueueException;
    int size();
}

