package String_Assignment;
/*
Immutable: immutable strings are such strings which cannot be changed or altered
Mutable: mutable strings are such strings which can be changed or altered
* */
public class SA_StringIsImmutable {
    public static void main(String[] args) {
        String x = "Target";
        String y = "Upcurve22";
        x.concat(y);
        System.out.println(x);
        System.out.println("The output we will obtain will not be concatenated");
        StringBuffer p = new StringBuffer("Target");
        StringBuffer q = new StringBuffer("Upcurve22");
        p.append(q);
        System.out.println(p);
        StringBuilder m = new StringBuilder("Target");
        StringBuilder n = new StringBuilder("Upcurve22");
        m.append(n);
        String s1 = "JAVA";
        String s2 = "JAVA";
        System.out.println(s1 == s2);         //Output : true
        s1 = s1 + "J2EE";
        System.out.println(s1 == s2);         //Output : false
    }
}
