package Hash.Entities;

import Hash.Exceptions.NoExiste;

public interface MyHash<K, V> {
    void put(K key, V value);

    V get(K key) throws NoExiste;

    public void remove(K key) throws NoExiste, HashVacio;

    public boolean containsKey(K key);

    public void printTable();

    int tableSize();

    public boolean isEmpty();

    public void clear();

   /* public boolean isDeleted();*/

}

