public class XYX {
public V remove (Object key) {

    readWriteLock.writeLock ().lock ();

    V value;

    try {

        value = super.remove (key);

    } finally {

        readWriteLock.writeLock ().unlock ();

    }

    return value;

}

}