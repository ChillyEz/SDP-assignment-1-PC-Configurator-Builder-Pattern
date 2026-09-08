public class Director {
    private BuilderPC builder;

    public Director(BuilderPC builder) {
        this.builder = builder;
    }

    // OFFICE PC--------------------
    public PC constructOfficePC() {
        return builder
                .buildMotherboard("MSI")
                .buildCPU("Intel i7")
                .buildGPU(new IntegratedGraphics())
                .buildPSU("Corsair RM850x")
                .buildStorage("Samsung 970 EVO 1TB")
                .buildRAM("G.Skill Ripjaws V 32GB")
                .buildCase("Fractal Design Define 7").build();
    }

    // GAMING PC--------------------
    public PC constructGamingPC() {
        return builder
                .buildMotherboard("ASUS ROG Strix")
                .buildCPU("AMD Ryzen 9 5900X")
                .buildGPU(new DedicatedGraphics())
                .buildPSU("EVGA SuperNOVA 1000W")
                .buildStorage("Samsung 980 PRO 2TB")
                .buildRAM("Corsair Vengeance RGB Pro 64GB")
                .buildCase("NZXT H710i").build();
    }
}