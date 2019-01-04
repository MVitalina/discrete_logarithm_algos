package src;
import static java.lang.Math.*;


public class MatchingAlgorithm {
    private MathPlus mathPlus = new MathPlus();
    MatchingAlgorithm() {}

    public int DoAlgo(int a, int b, int p) {
        int H = (int)floor(pow(p, 0.5)) + 1;
        int c = mathPlus.mod((int)pow(a, H), p);
        int table1[] = new int [H];
        for (int u = 0; u < H; u++) {
            table1[u] = mathPlus.mod((int)pow(c, u+1), p);
        }
        int table2[] = new int [H+1];
        for (int v = 0; v <= H; v++) {
            table2[v] = mathPlus.mod(b * (int)pow(a, v), p);
            for (int u = 0; u < H; u++){
                if (table1[u] == table2[v]) { //needed only 1 number
                    return mathPlus.mod(H*(u+1)-v, p-1);
                }
            }
        }



        return 0;
    }
}
