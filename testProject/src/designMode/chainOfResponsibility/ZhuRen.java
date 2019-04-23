package designMode.chainOfResponsibility;

/**
 * 一个请求处理者（主任）
 */
public class ZhuRen extends Handler {
    public ZhuRen(String name) {
        super(name);
    }

    @Override
    public void setHandlerRequest(HandlerRequest handlerRequest) {
        LeaveRequest request = (LeaveRequest) handlerRequest;
        System.out.println("经过了" + name);
        if (request.getDay() <= 0) {
            LeavePermission.permission(request, name);
            return;
        }
        if (request.getDay() > 0 && request.getDay() <= 3) {
            LeavePermission.permission(request, name);
        } else {
            successor.setHandlerRequest(request);
        }

    }
}
