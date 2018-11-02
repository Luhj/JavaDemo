package PopStateStack;

/**
 * Created by Luhaijie on 2018/11/2.
 */
public interface Component {
    boolean handleBack();

    boolean handleAddStack(int stackIndex);

    boolean handleRemoveStack();

}
