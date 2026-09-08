/**
 * gamingBuilder
 */
public class GamingBuilder implements BuilderPC {
    private String motherboard;
    private String cpu;
    private Graphics gpu;
    private String psu;
    private String storage;
    private String ram;
    private String pcCase;

    @Override
    public BuilderPC buildMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    @Override
    public BuilderPC buildCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }
    @Override 
    public BuilderPC buildGPU(Graphics gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public BuilderPC buildPSU(String psu) {
        this.psu = psu;
        return this;
    }

    @Override
    public BuilderPC buildStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public BuilderPC buildRAM(String ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public BuilderPC buildCase(String pcCase) {
        this.pcCase = pcCase;
        return this;
    }

    @Override
    public PC build() {
        return new PC(motherboard, cpu, gpu, psu, storage, ram, pcCase);
    }


}
