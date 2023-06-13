package P06MIlitaryElite.impl;

import P06MIlitaryElite.interfaces.Engineer;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    public EngineerImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }
}
