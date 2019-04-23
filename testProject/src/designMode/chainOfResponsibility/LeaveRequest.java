package designMode.chainOfResponsibility;

/**
 * 请假条
 */
public class LeaveRequest implements HandlerRequest{
    private String requestName;//请假人姓名
    private int day;//请假天数
    private String reason;//请假理由

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "requestName='" + requestName + '\'' +
                ", day=" + day +
                ", reason='" + reason + '\'' +
                '}';
    }
}
