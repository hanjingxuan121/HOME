import java.util.Arrays;

public class rank {

    public static String[] reRankCount(String[] input){
        if(input==null||input.length==0){
            return new String[0];
        }

        int r,g,b;
        r=g=b=0;
        for(String s:input){
            if(s=="r"){
                r++;
            }else if(s=="g"){
                g++;
            }else if(s=="b"){
                b++;
            }
        }
        String output[] = new String[input.length];
        int i=0;
        while(r>0){
            output[i]="r";
            i++;
            r--;
        }
        while(g>0){
            output[i]="g";
            i++;
            g--;
        }
        while(b>0){
            output[i]="b";
            i++;
            b--;
        }

        return output;
    }

    public static String[] reRankTwoPointers(String[] input){
        if(input==null||input.length==0){
            return new String[0];
        }

        int i,left,right;
        i=left=0;right=input.length-1;

        while(i<=right){
            if(input[i].equals("r")){
                String t1 = input[i];
                input[i]=input[left];
                input[left]=t1;
                i++;
                left++;
            }else if(input[i].equals("g")){
                i++;

            }else if(input[i].equals("b")){
                String t2 = input[i];
                input[i]=input[right];
                input[right]=t2;
                right--;
            }

        }


        return input;
    }

    public static void main(String[] args) {
        String[] input = new String[]{"r","r","b","g","b","r","g","b"};
       //Arrays.asList(reRankTwoPointers(input)).forEach(e-> System.out.print(e));
        System.out.println(reRankTwoPointers(input));
    }
}
