package practice3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SemaphoreSynchronizedSet<E> implements Set<E> {
    final private Set<E> set;
    final private Semaphore semaphore;

    public SemaphoreSynchronizedSet() {
        set = new HashSet<>();
        semaphore = new Semaphore(1);
    }

    public SemaphoreSynchronizedSet(Set<E> set) {
        this.set = set;
        semaphore = new Semaphore(1);
    }

    public SemaphoreSynchronizedSet(Set<E> set, Semaphore semaphore) {
        this.set = set;
        this.semaphore = semaphore;
    }

    @Override
    public int size() {
        try {
            semaphore.acquire();
            return set.size();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
            return set.isEmpty();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean contains(Object o) {
        try {
            semaphore.acquire();
            return set.contains(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Iterator<E> iterator() {
        try {
            semaphore.acquire();
            return set.iterator();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean add(E e) {
        try {
            semaphore.acquire();
            return set.add(e);
        } catch (InterruptedException exception) {
            throw new RuntimeException(exception);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean remove(Object o) {
        try {
            semaphore.acquire();
            return set.remove(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.containsAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        try {
            semaphore.acquire();
            return set.addAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.retainAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try {
            semaphore.acquire();
            return set.removeAll(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            set.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
