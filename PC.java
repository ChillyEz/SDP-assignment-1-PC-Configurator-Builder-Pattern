public class PC {
    private String motherboard;
    private String cpu;
    private Graphics gpu;
    private String psu;
    private String storage;
    private String ram;
    private String pcCase;

    public PC(String motherboard, String cpu, Graphics gpu, String psu, String storage, String ram, String pcCase) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.gpu = gpu;
        this.psu = psu;
        this.storage = storage;
        this.ram = ram;
        this.pcCase = pcCase;
    }

    @Override
    public String toString() {
        return "PC{" +
                "motherboard='" + motherboard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu.getName() + '\'' +
                ", psu='" + psu + '\'' +
                ", storage='" + storage + '\'' +
                ", ram='" + ram + '\'' +
                ", pcCase='" + pcCase + '\'' +
                '}';
    }
}
