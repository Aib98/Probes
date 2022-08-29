import java.util.Arrays;

public class Alcohol {
    public static void main(String[] args) {
        // Переделать через функцию, без массивов
        // C2H5(OH) : C = 2, H =6, O = 1.

        int[] atoms = {50, 50, 50};
        int[] minAtoms = {2, 6, 1};


        int carbon = atoms[0] / minAtoms[0];
        int hydrogen = atoms[1] / minAtoms[1];
        int oxygen = atoms[2] / minAtoms[2];

        int[] c2h5oh = {carbon, hydrogen, oxygen};
        System.out.println(Arrays.toString(c2h5oh));
        Arrays.sort(c2h5oh);
        int maxMolecules = c2h5oh[0];
        System.out.println(maxMolecules);


    }
}
