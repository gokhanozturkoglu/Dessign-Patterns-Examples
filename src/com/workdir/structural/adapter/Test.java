package com.workdir.structural.adapter;

public class Test {

    public static void main(String[] args) {

        Plug plug = new Plug();

        Iron iron = new Iron();
        Refrigerator refrigerator = new Refrigerator();

        plug.giveElectric(iron);
        plug.giveElectric(refrigerator);

        SamsungPhone samsungPhone = new SamsungPhone();
        PhoneEAppliancesAdapter adapter = new PhoneEAppliancesAdapter(samsungPhone);

        plug.giveElectric(adapter);
    }
}
