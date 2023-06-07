package Queue.Entities;

import Queue.exceptions.EmptyQueueException;

public interface MyQueue <Tipo> {

    void enqueue (Tipo element);

    Tipo dequeue () throws EmptyQueueException;

    boolean isEmpty();
}
 