
public class E {
    public static void main(String[] args) {

        String ln="desserts";
char[] x=ln.toCharArray();
StringBuilder b=new StringBuilder();
for (int i=x.length-1;i>0;i--) {
b.append(x[i]);

}
    String s=b.toString();
        System.out.println(s);

    }
}
//كيفيه عكس الكلمه