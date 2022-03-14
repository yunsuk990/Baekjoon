import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.io.IOException;
public class baekjoon{
    static char[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for(int i=0; i<arr.length;i++){
            for(int z=0; z<arr[0].length; z++){
                arr[i][z] = ' ';
            }
        }
        star(0,0,N);
        for(char[] ch : arr){
            for(char chh : ch){
                bw.write(chh+"");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    public static void star(int x, int y, int N){
        if(N==1){
            arr[x][y]='*';
            return;
        }
        for(int i=0; i<3;i++){
            for(int z=0; z<3; z++){
                if(!((i==1)&&(z==1))){
                    star(x+i*(N/3),y+z*(N/3),N/3);
                }
            }
        }
    }
}
