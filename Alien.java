package comp1069;

public abstract class Alien {
        // include two protected and one private data members of your choice
        protected int numOfEyes;
        protected int numOfLegs;
        // include one private data member of your choice
        private int numOfAntennae;


        // Include a constructor that requires a value for each data field
        public Alien(int eyes, int legs, int antennae) {
                this.numOfEyes = eyes;
                this.numOfLegs = legs;
                this.numOfAntennae = antennae;
        }
        // Include a toString() method that returns a String containing a complete description of the Alien
        public String toString() {
                String alienDescription = "Number of eyes: " + this.numOfEyes + " Number of legs: " + this.numOfLegs + " Number of antennae: " + this.numOfAntennae;

                return alienDescription;
        }
        public int getAntennae() {
                return this.numOfAntennae;
        }

}
