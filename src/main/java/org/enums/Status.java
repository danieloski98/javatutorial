package org.enums;

public enum Status {
    POOR("POOR"),
    MIDDLE_CLASS("MIDDLE CLASS"),
    RICH("RICH"),
    WEALTHY("WEALTHY");

    private final String value;

    private Status(String status) {
        this.value = status;
    }

    public String getValue() {
        return value;
    }
}
