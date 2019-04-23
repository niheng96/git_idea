package io.newFile;

public class PathChecker extends Checker {

    private String checkers[] = {""," ",null};

    public boolean check(String path,String[] checkers) {
        if(checkers==null){
            this.checkers = checkers;
        }
        return method1(path, checkers);
    }

    public boolean check(String path) {
        return method1(path, checkers);
    }

    private boolean method1(String path, String[] checkers) {
        for (int i = 0; i < checkers.length; i++) {
            if (path.equals(checkers[i])) {
                return true;
            }
        }
        return false;
    }
}
