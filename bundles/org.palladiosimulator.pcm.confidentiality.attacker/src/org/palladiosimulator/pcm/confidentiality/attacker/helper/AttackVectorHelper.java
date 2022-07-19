package org.palladiosimulator.pcm.confidentiality.attacker.helper;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackVector;

public class AttackVectorHelper {

    private AttackVectorHelper() {
        assert false;
    }

    /**
     * Checks whether an {@link AttackVector} is included within the other. < br\>
     *
     * <p>
     * Included means here, that an attacker can still perform the attack despite that the attack
     * vectors are note the same. The following table shows which attack vectors are included in
     * which.
     * <table>
     * <tr>
     * <th>AttackVector</th>
     * <th>Included</th>
     * </tr>
     * <tr>
     * <td>Network</td></td>Network,Adjacent Network, Local</td>
     * </tr>
     * <tr>
     * <td>Adjacent Network</td>
     * <td>Adjacent Network, Local</td>
     * </tr>
     * <tr>
     * <td>Local</td>
     * <td>Local</td>
     * </tr>
     * </table>
     * </p>
     *
     * @param current
     *            vector to compare
     * @param target
     *            comparision vector
     * @return true if included
     */
    public static boolean isIncluded(final AttackVector current, final AttackVector target) {
        if (current.equals(target)) {
            return true;
        } else if (target == AttackVector.NETWORK) {
            return current == AttackVector.LOCAL || current == AttackVector.ADJACENT_NETWORK;
        } else if (target == AttackVector.ADJACENT_NETWORK) {
            return current == AttackVector.LOCAL;
        }
        return false;
    }
}
