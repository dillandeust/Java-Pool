import java.util.HashMap;
import java.util.Map;

public class Stock {
    Map<Class<? extends Food>, Integer> store = new HashMap<Class<? extends Food>, Integer>();

    public Stock() {
        store.put(Panini.class, 100);
        store.put(HamSandwich.class, 100);
        store.put(AppleSmoothie.class, 100);
        store.put(Coke.class, 100);
        store.put(Cookie.class, 100);
        store.put(CheeseCake.class, 100);
        store.put(SoftBread.class, 100);
        store.put(FrenchBaguette.class, 100);
    }

    public int getNumberOf(Class<? extends Food> item) {
        return store.get(item);
    }

    public boolean add(Class<? extends Food> item) throws NoSuchFoodException {
        if (store.get(item) != null) {
            Integer add = store.get(item) + 1;
            store.put(item, add);
            return true;
        } else {
            throw new NoSuchFoodException("No such food type: " + item.getName()+".");
        }
    }

    public boolean remove(Class<? extends Food> item) throws NoSuchFoodException {
        if (store.get(item) != null) {
            if (store.get(item) > 0) {
                Integer remove = store.get(item) - 1;
                store.put(item, remove);
                return true;
            } else {
                return false;
            }
        } else {
            throw new NoSuchFoodException("No such food type: " + item.getName()+".");
        }
    }
}
