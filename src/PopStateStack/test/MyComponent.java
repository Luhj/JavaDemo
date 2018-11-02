package PopStateStack.test;

import PopStateStack.Component;
import PopStateStack.StackManager;

/**
 * Created by Luhaijie on 2018/11/2.
 */
public class MyComponent {
    Component component = new Component() {
        int stackIndex;

        @Override
        public boolean handleBack() {
            System.out.println("MyComponent handleBack");
            return false;
        }

        @Override
        public boolean handleAddStack(int index) {
            System.out.println("MyComponent handleAddStack index: " + index);
            this.stackIndex = index;
            return false;
        }

        @Override
        public boolean handleRemoveStack() {
            System.out.println("MyComponent handleRemoveStack");
            return false;
        }

        @Override
        public String toString() {
            return "MyComponent index: " + stackIndex;
        }
    };
    StackManager manager = null;

    MyComponent(StackManager manager) {
        this.manager = manager;
        manager.add(component);
    }

    void destroy() {
        manager.delete(component);
    }
}
