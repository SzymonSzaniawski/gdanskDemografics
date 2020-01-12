package pl.sda.gdanskDemografics;

public class District {

    private String districtName;
    private String gender;
    private Integer agreUnderEighteen;
    private Integer agreFromEighteenToFiftyNine;
    private Integer agreFromSixtyToSixtyFour;
    private  Integer ageOverSixtyFour;

    public District(String districtName, String gender,
                    Integer agreUnderEighteen, Integer agreFromEighteenToFiftyNine,
                    Integer agreFromSixtyToSixtyFour, Integer ageOverSixtyFour) {
        this.districtName = districtName;
        this.gender = gender;
        this.agreUnderEighteen = agreUnderEighteen;
        this.agreFromEighteenToFiftyNine = agreFromEighteenToFiftyNine;
        this.agreFromSixtyToSixtyFour = agreFromSixtyToSixtyFour;
        this.ageOverSixtyFour = ageOverSixtyFour;
    }
}
