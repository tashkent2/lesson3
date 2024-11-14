sealed class Engine permits PetrolEngine, DieselEngine, ElectricEngine  {

        private String type;

        public Engine(String type) {
                this.type = type;

        }

        public String getType () {
                return type;
        }


        final class PetrolEngine extends Engine {
                public PetrolEngine() {
                        super("Petrol");
                }
        }


        final class DieselEngine extends Engine {
                public DieselEngine() {
                        super("Diesel");
                }
        }


        final class ElectricEngine extends Engine {
                public ElectricEngine() {
                        super("Electric");
                }
        }
}