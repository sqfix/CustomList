import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

public class CustomList<E> extends AbstractList<E> {
    private final Logger LOG = LoggerFactory.getLogger(CustomList.class);
    private final static int DEFAULT_CAPACITY = 1;
    private int size = 0;
    private Object[] elements;


    CustomList() {
        LOG.info("Creating CustomList");
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E e) {
        LOG.info("Try to add an object " + e);
        if (size == elements.length) {
            LOG.info("Expansion the list...");
            doExpansion();
        }
        elements[size++] = e;
        LOG.info(String.format("The element %s has added! Size now: %o", e, size));
        return true;
    }

    private void doExpansion() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity * 2;
        elements = Arrays.copyOf(elements, newCapacity);
        LOG.info("The list expanded! new Length " + elements.length);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException();
        return (E) elements[index];
    }

    @Override
    public boolean remove(Object o) {
        //STUB
        return false;
    }

    @Override
    public E remove(int index) {
        //STUB;
        return null;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        //STUB
        return false;
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        //STUB
    }

    @Override
    public E set(int index, E element) {
        //STUB
        return null;
    }
}
