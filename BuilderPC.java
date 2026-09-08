public interface BuilderPC {
    
    BuilderPC buildMotherboard(String motherboard);
    BuilderPC buildCPU(String cpu);
    BuilderPC buildGPU(Graphics gpu);
    BuilderPC buildPSU(String psu);
    BuilderPC buildStorage(String storage);
    BuilderPC buildRAM(String ram);
    BuilderPC buildCase(String pcCase);


    PC build();
}   
