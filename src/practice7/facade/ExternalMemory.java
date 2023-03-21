package practice7.facade;

public class ExternalMemory {
    public byte[] read(long lba, int size) {
        System.out.println("read lba = " + lba + ", size = " + size);
        return new byte[size];
    }
}
