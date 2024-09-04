package consumer.specific;

import com.dj.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[child.optionalMethod]: Extra stuff happened here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//
//        System.out.println("[child.recommendedMethod]: I'll do things my way");
//    }

    private void mandatoryMethod() {
        System.out.println("[child.mandatoryMethod]: My own important stuff");
    }

    public static void recommendedStatic() {
        System.out.println("[Child.recommendedStatic]: Best way to do it");
        optionalStatic();
//        mandatoryStatic();
    }
}
