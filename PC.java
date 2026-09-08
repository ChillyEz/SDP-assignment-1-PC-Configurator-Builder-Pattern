public class PC {
    private final  String motherboard;
    private final  String cpu;
    private final  Graphics gpu;
    private final  String psu;
    private final  String storage;
    private final  String ram;
    private final  String pcCase;

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
