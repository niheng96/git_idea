package designMode.chainOfResponsibility;

/**
 * 一个请求处理者（经理）
 */
public class JingLi extends Handler {

    public JingLi(String name) {
        super(name);
    }

    @Override
    public void setHandlerRequest(HandlerRequest handlerRequest) {
        LeaveRequest request = (LeaveRequest) handlerRequest;
        System.out.println("经过了"+name);
        if (request.getDay() > 10) {
            LeavePermission.permission(request,name);
        }
    }
}
