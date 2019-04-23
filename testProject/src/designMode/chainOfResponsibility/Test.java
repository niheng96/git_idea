package designMode.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Handler h1 = new ZhuRen("车间主任");
        Handler h2 = new ZhuGuan("部门主管");
        Handler h3 = new JingLi("经理");

        //设置职责链关系
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        LeaveRequest request = new LeaveRequest();
        request.setRequestName("张三");
        request.setDay(6);
        request.setReason("回家");

        h1.setHandlerRequest(request);

    }
}
