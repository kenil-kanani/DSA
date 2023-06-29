/**
 * PrintBalancedParentheses
 */
public class PrintBalancedParentheses {

    // oc - Open Count -> represent currant number of open parentheses present in
    // the ans string
    // cc - Close Count -> represent currant number of close parentheses present in
    // the ans string
    public static void printPar(int n, int oc, int cc, String ans) {

        if (oc < n)
            printPar(n, oc + 1, cc, ans + "(");
        if (oc > cc)
            printPar(n, oc, cc + 1, ans + ")");
        if (n == oc && n == cc) {
            System.out.println(ans);
            return;
        }
    }

    public static void main(String[] args) {
        printPar(3, 0, 0, "");
    }
}