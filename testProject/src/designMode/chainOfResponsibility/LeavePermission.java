package designMode.chainOfResponsibility;

/**
 * 请假证明
 */
public class LeavePermission {
    public static void permission(LeaveRequest request, String name) {
        System.out.println("=============================");
        System.out.println(request.getRequestName() +
                "因" + request.getReason() +
                "申请请假" + request.getDay() + "天");
        if(request.getDay()<=0){
            System.out.println(name+"说了句gun");
            return;
        }
        if(request.getDay()>30){
            System.out.println(name+"不批准请假");
        }else {
            System.out.println(name+"批准请假");
        }
        System.out.println("=============================");
    }
}
