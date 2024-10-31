public class App {

    public static int[] maiores3(int[] v){
        int maior1 = v[0], maior2 = v[1], maior3 = v[2];

        for(int i = 0; i < v.length; i++){
            if(v[i] > maior1){
                maior3 = maior2;
                maior2 = maior1;
                maior1 = v[i];
            }else if(v[i] > maior2 && v[i] < maior1){
                maior3 = maior2;
                maior2 = v[i];
            }else if(v[i] > maior3 && v[i] < maior2){
                maior3 = v[i];
            }
        }
        
        int vt[] = {maior1, maior2, maior3};

        return vt;
    }
    public static void main(String[] args) throws Exception {
        int n[] = {1,40,2,10,20,0,5,4,3};
        n = maiores3(n);

        System.out.println("1º maior: " + n[0]);
        System.out.println("2º maior: " + n[1]);
        System.out.println("3º maior: " + n[2]);
    }
}