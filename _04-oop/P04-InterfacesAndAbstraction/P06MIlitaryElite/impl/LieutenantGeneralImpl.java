package P06MIlitaryElite.impl;

import P06MIlitaryElite.interfaces.LieutenantGeneral;
import P06MIlitaryElite.interfaces.Private;

import java.util.ArrayList;
import java.util.Collection;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Collection<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, Collection<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }

    @Override
    public void addPrivate(Private priv) {
        this.privates.add(priv);
    }
}
