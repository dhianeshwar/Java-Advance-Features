package Java8Features;

import Threads.Main;

import javax.script.*;

public class JsEngine {
    public static void main(String[] args) throws ScriptException {
        ScriptEngine scriptEngine= (ScriptEngine) new Main();
        scriptEngine.eval("print(+"+"javascript"+")");

    }
}
