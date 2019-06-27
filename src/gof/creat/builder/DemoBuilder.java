package gof.creat.builder;

class SuperComputer{
    private String HDD;
    private String RAM;

    private boolean isGraphic;
    private boolean isBlueTooth;

    public SuperComputer(Builder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphic = builder.isGraphic;
        this.isBlueTooth = builder.isBlueTooth;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphic() {
        return isGraphic;
    }

    public boolean isBlueTooth() {
        return isBlueTooth;
    }

    //builder

    public static class Builder {
        private String HDD;
        private String RAM;

        private boolean isGraphic;
        private boolean isBlueTooth;

        public Builder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public Builder setGraphic(boolean graphic) {
            isGraphic = graphic;
            return this;
        }

        public Builder setBlueTooth(boolean blueTooth) {
            isBlueTooth = blueTooth;
            return this;
        }

        public static Builder builder(String HDD, String RAM) {
            return new Builder(HDD, RAM);

        }
        public SuperComputer build() {
            return new SuperComputer(this);
        }
    }

}


public class DemoBuilder {

    public static void main(String[] args) {
        SuperComputer superComputer =
                SuperComputer.Builder.builder("500T", "100G")
                        .setBlueTooth(false)
                        .setGraphic(true)
                        .build();

        System.out.println(superComputer);
        System.out.println(superComputer.getHDD());
        System.out.println(superComputer.getRAM());
        System.out.println(superComputer.isBlueTooth());
        System.out.println(superComputer.isGraphic());

    }
}
