public class _4_LeetCode {
    public static void main(String[] args) {
        int a[] = {1, 3,10};
        int b[] = {2, 4,8};
        int n = a.length + b.length;
        int c[] = new int[n];
        
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
// add remaining in a & b
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        float d =n/2.0f;
        if(d ==(int)d){ 
            System.out.println(c[n/2-1]+" "+c[n/2]);// for even number 
        }
           
        else{
           
            System.out.println(c[n/2]);// for odd number
        }
        
        

    }
}
