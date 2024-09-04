package com.dj;

import java.util.Arrays;

public class PersonImmutable {

    private final String name;
    private final String dob;
    protected final PersonImmutable[] kids;

    public PersonImmutable(String name, String dob, PersonImmutable[] kids) {
        this.name = name;
        this.dob = dob;
        this.kids = kids == null ? null : Arrays.copyOf(kids, kids.length);
    }

    public PersonImmutable(String name, String dob) {
        this(name, dob, null);
    }

    protected PersonImmutable(PersonImmutable peron) {
        this(peron.getName(), peron.getDob(), peron.getKids());
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDob() {
        return dob;
    }

//    public void setDob(String dob) {
//        this.dob = dob;
//    }

    public final PersonImmutable[] getKids() {
        return kids == null ? null : Arrays.copyOf(kids, kids.length);
    }

//    public void setKids(PersonImmutable[] kids) {
//        this.kids = kids;
//    }

    @Override
    public String toString() {
        String kidString = "n/a";
        if (kids != null) {
            String [] names = new String[kids.length];
            Arrays.setAll(names, i -> names[i] = kids[i] == null ? "" : kids[i].name);
            kidString = String.join(", ", names);

        }
        return name + ", dob = " + getDob() + ", kids = " + kidString;
    }
}
