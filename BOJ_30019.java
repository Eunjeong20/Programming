import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main
{
    public static void main(String[] args) throws IOException {
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringTokenizer token = new StringTokenizer(str);
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        int prev_e[] = new int[n];
        int rect, s, e;
        
        for(int i=0; i<m; i++) {
            str = br.readLine();
        
            token = new StringTokenizer(str);
            rect = Integer.parseInt(token.nextToken()) -1;
            s = Integer.parseInt(token.nextToken());
            e = Integer.parseInt(token.nextToken());
            
            if (prev_e[rect] == 0 || prev_e[rect] <= s) {
                bw.write("YES\n");
                prev_e[rect] = e;
            }
            else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
	}
}
