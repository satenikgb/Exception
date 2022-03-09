package day22;

public class Main {
    public static void main(String[] args) {

        DefaultStack st=new DefaultStack();
        st.push(12);
        st.push(45);
        st.push(54);
        st.push(12);
        st.push(45);
        st.push(54);
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
