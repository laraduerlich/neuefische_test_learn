package org.sessions.enums_optionals;

public enum Weekdays {

    MONDAY ("Workday", true),
    TUESDAY("Workday", true),
    WEDNESDAY("Workday", true),
    THURSDAY("Workday", true),
    FRIDAY("Workday", true),
    SATURDAY("Weekend", false),
    SUNDAY("Weekend", false);

    private final String value;
    private final boolean hasToWork;

    // wird nur vom System aufgerufen
    Weekdays(String value, boolean hasToWork) {
        this.value = value;
        this.hasToWork = hasToWork;
    }

    public String getValue() {
        return value;
    }

    public boolean hasToWork() {
        return hasToWork;
    }

}
