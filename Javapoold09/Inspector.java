import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Inspector<T> {
    private Class<T> inspectedClass;

    public Inspector(Class<T> inspectedClass) {
        this.inspectedClass = inspectedClass;
    }

    public void displayInformations() {
        System.out.println("Information of the " +'"'+ inspectedClass.getTypeName()+'"'+" class:");
        System.out.println("Superclass: " + inspectedClass.getSuperclass().getName());
        System.out.println(inspectedClass.getDeclaredMethods().length + " methods:");
        Method[] methods = inspectedClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("- " + method.getName());
        }
        System.out.println(inspectedClass.getDeclaredFields().length + " fields:");
        Field[] fields = inspectedClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("- " + field.getName());
        }
    }

    public T createInstance() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        return inspectedClass.getDeclaredConstructor().newInstance();
    }
}