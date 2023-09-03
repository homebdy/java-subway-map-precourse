package subway.constant;

public enum InformationMessage {

    COMPLETE_CREATE_STATION("지하철 역이 등록되었습니다."),
    COMPLETE_DELETE_STATION("지하철 역이 삭제되었습니다."),
    STATION_ELEMENT("%s\n");

    private static final String PREFIX = "[INFO] ";
    private final String message;

    InformationMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return PREFIX + message;
    }
}
