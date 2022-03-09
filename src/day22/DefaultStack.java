package day22;

public class DefaultStack implements Stack {
    private int MAX_SiZE = 5;
    private int index = 0;
    private int[] nums = new int[MAX_SiZE];

    public DefaultStack() {

    }

    @Override
    public void push(int val) {
        if (index < MAX_SiZE) {

            nums[index] = val;
            index++;
        } else
            throw new StackIndexOutOfBoundsException("Stack is full");
    }


    @Override
    public int pop() {
        if (index <= 0) {
            throw new EmptyStackException("Empty Stack");
        }

        index--;

        return nums[index];
    }
}
