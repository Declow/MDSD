package lightswitch;

import dsl.FluentMachine;
import dsl.MetaModel;
import dsl.MetaModelExecutor;

public class LightSwitchMachine {

    private static int MIN_POWER = 1;
    private static int MAX_POWER = 100;

    public static void main(String[] args) {
        MetaModel mm = new MetaModel();

        FluentMachine fm = FluentMachine.build()
                .IntegerVariable("power")
                .State("POWER_OFF")
                    .Transition("PLUS").To("POWER_ON").SetState("power", MIN_POWER).EndTransition()
                .State("POWER_ON")
                    .Transition("PLUS_SLOW").SlowlyTo("MAX_POWER", MAX_POWER)
                        .ChangeState("power", 1).EndTransition()
                    .Transition("PLUS_FAST").FastTo("MAX_POWER", MAX_POWER)
                        .ChangeState("power", 1).EndTransition()
                    .Transition("MINUS_SLOW").SlowlyTo("POWER_OFF", MIN_POWER - 1)
                        .ChangeState("power", -1).EndTransition()
                    .Transition("MINUS_FAST").FastTo("POWER_OFF", MIN_POWER - 1)
                        .ChangeState("power", -1).EndTransition()
                .State("MAX_POWER")
                    .Transition("MINUS").To("POWER_ON")
                        .ChangeState("power", -1).EndTransition();

        mm = fm.getModel();

        MetaModelExecutor mme = new MetaModelExecutor(mm);
    }

}
