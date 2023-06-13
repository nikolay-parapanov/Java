package P06MIlitaryElite.impl;

import P06MIlitaryElite.interfaces.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }
}
