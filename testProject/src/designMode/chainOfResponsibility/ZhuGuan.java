package designMode.chainOfResponsibility;

/**
 * 一个请求处理者（主管）
 */
public class ZhuGuan extends Handler {

    public ZhuGuan(String name) {
        super(name);
    }

    @Override
    public void setHandlerRequest(HandlerRequest handlerRequest) {
        LeaveRequest request = (LeaveRequest) handlerRequest;
        System.out.println("经过了"+name);
        if (request.getDay() > 3 && request.getDay() <= 10) {
            LeavePermission.permission(request,name);
        } else {
            successor.setHandlerRequest(request);
        }
    }
}
