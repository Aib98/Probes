import java.util.Arrays;

public class Alcohol {
    public static void main(String[] args) {
        // C2H5(OH) : C = 2, H =6, O = 1.

        long[] atoms = {84, 54, 8};
        int[] minAtoms = {2, 6, 1};


        int carbon = (int) Math.floor((atoms[0]) / (minAtoms[0]));
        int hydrogen = (int) Math.floor((atoms[1]) / (minAtoms[1]));
        int oxygen = (int) Math.floor((atoms[2]) / (minAtoms[2]));

        int[] c2h5oh = {carbon, hydrogen, oxygen};
        System.out.println(Arrays.toString(c2h5oh));
        Arrays.sort(c2h5oh);
        int maxMolecules = c2h5oh[c2h5oh.length - c2h5oh.length];
        System.out.println(maxMolecules);


    }
}
