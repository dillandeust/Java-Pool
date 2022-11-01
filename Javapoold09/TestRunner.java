
import java.lang.reflect.Method;

public class TestRunner<T> {

    public void runTest(Class<T> annotation) throws Exception {
        for (Method method : annotation.getMethods()) {
            if (method.getAnnotation(Test.class) == null) continue;
            if (method.getAnnotation(Test.class).enabled() == true) {
                try {
                    method.invoke(annotation.getDeclaredConstructor().newInstance());
                } catch (Exception e) {
                    throw new Exception(e.getMessage());
                }
            }
        }
    }
}
