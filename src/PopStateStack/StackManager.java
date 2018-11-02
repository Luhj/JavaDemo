package PopStateStack;

import java.util.LinkedList;

/**
 * Created by Luhaijie on 2018/11/2.
 */
public class StackManager {
    private LinkedList<Component> stack = new LinkedList<>();
    private int cursor = -1;

    public boolean add(Component component) {
        cursor++;
        component.handleAddStack(cursor);
        stack.add(component);
        return true;
    }

    public Component pop() {
        if (cursor >= 0) {
            Component result = stack.remove(cursor--);
            result.handleRemoveStack();
            return result;
        } else
            return null;
    }

    public boolean delete(Component component) {
        component.handleRemoveStack();
        stack.remove(component);
        cursor--;
        return true;
    }

    public boolean handleBack() {
        return pop().handleBack();
    }

    public String toString() {
        return (stack.toString() + "\nindex: " + cursor);
    }
}
