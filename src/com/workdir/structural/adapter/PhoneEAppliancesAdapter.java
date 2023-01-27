package com.workdir.structural.adapter;

public class PhoneEAppliancesAdapter implements ElectricalAppliances {

    private Phone phone;

    public PhoneEAppliancesAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int plugInAndRun() {
        return phone.charge();
    }
}
