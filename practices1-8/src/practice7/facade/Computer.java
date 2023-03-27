package practice7.facade;

public class Computer {
    private final static long BOOT_ADDRESS = 1L;
    private final static long BOOT_SECTOR = 2L;
    private final static int SECTOR_SIZE = 3;

    private CPU cpu;
    private MainMemory memory;
    private ExternalMemory hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new MainMemory();
        this.hardDrive = new ExternalMemory();
    }

    public void startComputer() {
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
