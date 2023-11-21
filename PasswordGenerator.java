
public class PasswordGenerator {
    public static void main(String []args) {
        int passLength=8;
        Random random=new Random();
        String smallAlpha="abcdefghiklmnopqrstuvwxyz";
        String capAlpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number="1234567890";
    
        String values=capAlpha+smallAlpha+number;
        char ch[]=new char[8];
        for(int i=0;i<passLength;i++)
        {
            ch[i]=values.charAt(random.nextInt(values.length()));
        }
        System.out.println(ch);
    }
}