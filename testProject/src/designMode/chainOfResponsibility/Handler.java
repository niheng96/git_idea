package designMode.chainOfResponsibility;

public abstract class Handler {
    public String name;
    public Handler successor;//继承者,接力者

    public Handler(String name){
        super();
        this.name = name;
    }

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void setHandlerRequest(HandlerRequest handlerRequest);

}
