package PopStateStack.test;

import PopStateStack.StackManager;

/**
 * Created by Luhaijie on 2018/11/2.
 */
public class Main {
    public static void main(String[] args) {
        StackManager stackManager = new StackManager();
        System.out.println(stackManager);

        MyComponent myComponent0 = new MyComponent(stackManager);
        MyComponent myComponent1 = new MyComponent(stackManager);
        MyComponent myComponent2 = new MyComponent(stackManager);
        MyComponent myComponent3 = new MyComponent(stackManager);
        MyComponent myComponent4 = new MyComponent(stackManager);
        MyComponent myComponent5 = new MyComponent(stackManager);

        System.out.println(stackManager);
        stackManager.pop();
        System.out.println(stackManager);
        myComponent2.destroy();
        System.out.println(stackManager);
        MyComponent myComponent6 = new MyComponent(stackManager);
        myComponent0.destroy();
        myComponent4.destroy();
        System.out.println(stackManager);
        stackManager.pop();
        stackManager.pop();
        System.out.println(stackManager);
    }
}
