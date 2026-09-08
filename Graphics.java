public abstract class Graphics {
    public abstract String getName();
}

class IntegratedGraphics extends Graphics {
    @Override
    public String getName() {
        return "Integrated Graphics";
    }
}

class DedicatedGraphics extends Graphics {
    @Override
    public String getName() {
        return "Dedicated Graphics";
    }
}
