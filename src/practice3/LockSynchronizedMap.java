package practice3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSynchronizedMap<K, V> implements Map<K, V> {
    private final Map<K,V> map;
    private final Lock lock;

    public LockSynchronizedMap() {
        map = new HashMap<>();
        lock = new ReentrantLock();
    }

    public LockSynchronizedMap(Map<K, V> map) {
        this.map = map;
        lock = new ReentrantLock();
    }

    public LockSynchronizedMap(Map<K, V> map, Lock lock) {
        this.map = map;
        this.lock = lock;
    }

    @Override
    public int size() {
        lock.lock();
        try {
            return map.size();
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        try {
            return map.isEmpty();
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        try {
            return map.containsKey(key);
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        try {
            return map.containsKey(value);
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public V get(Object key) {
        lock.lock();
        try {
            return map.get(key);
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public V put(K key, V value) {
        lock.lock();
        try {
            return map.put(key, value);
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public V remove(Object key) {
        lock.lock();
        try {
            return map.remove(key);
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public String toString() {
        lock.lock();
        try {
            return map.toString();
        }
        finally {
            lock.unlock();
        }
    }
}
