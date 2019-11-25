public class MinMaxArrayValue {
    public static void main(String args[]){
        int[] array1 =new int[]{23,45,67};
        int maxvalue = array1[0];
        for(int i=1;i<array1.length;i++){
            if(array1[i] > maxvalue){
                 maxvalue =array1[i];

            }

        }
        System.out.println("Max Value is:"+maxvalue);
        int minValue= array1[0];
        for(int j=1;j<array1.length; j++){
            if(array1[j] < minValue){
                minValue =array1[j];
            }

        }
System.out.println("Min Value is:" +minValue);
    }

}
