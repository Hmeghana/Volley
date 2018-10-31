package com.example.meghana.volley;

public class Model {
    public Model() {
    }



    private String constiuency;

    public Model(String constiuency, String MLA, String party) {
        this.constiuency = constiuency;
        this.MLA = MLA;
        this.party = party;
    }

    public String getConstiuency() {
        return constiuency;
    }

    public void setConstiuency(String constiuency) {
        this.constiuency = constiuency;
    }

    public String getMLA() {
        return MLA;
    }

    public void setMLA(String MLA) {
        this.MLA = MLA;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    private String MLA;
    private String party;
}


