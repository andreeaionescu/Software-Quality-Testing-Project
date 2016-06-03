package ro.ase.cts.model;

/**
 * Created by Andreea-Ionescu on 5/31/2016.
 */
public enum TipHobby {
        INDOOR ("INDOOR"),
        OUTDOOR ("OUTDOOR");

        private final String tip;

        private TipHobby(String s) {
            tip = s;
        }

        public boolean equalsTip(String otherTip) {
            return (otherTip == null) ? false : tip.equals(otherTip);
        }

        public String toString() {
            return this.tip;
        }
}
