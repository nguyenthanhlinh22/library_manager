public interface MyList<E> extends java.util.List<E> {
    public boolean add(E e );
    public void add(int index, E e);

    public void clear();
    public boolean contains(Object e);
    public E get( int index ) ;
    public int indexOf(Object e);
    public boolean isEmpty();
    public int lastIndexOf(Object e);
    public boolean remove(Object e);
    public E remove(int index);
    public E set (int index, E e );
    public int size ();
}
