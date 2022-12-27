public class MaximumElement{  
    public static void main(String[] args) { 
        int [] arr = new int [] {30, 45, 90, 34, 12};
        int max = arr[0]; 
        System.out.println("Given array is(30, 45, 90, 34, 12)");
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("In the given array, the maximum element is " + max);
        System.out.println("Sami Gautam");
    }  
}