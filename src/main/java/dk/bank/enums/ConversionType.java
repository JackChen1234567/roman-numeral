package dk.bank.enums;

public enum ConversionType {
    ROMANNUMERALTODIGIT("roman numeral to digit"),
    DIGITTOROMANNUMERAL("digit to roman numeral");
    private String value;
    ConversionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
