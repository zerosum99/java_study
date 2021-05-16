import test.*;


public class TVTest {
    public static void main(String[] args) {
        TV t = new TV();
        t.channel = 7;
        t.channelDown();
        System.out.println(" now channel " + t.channel);

    }
}
