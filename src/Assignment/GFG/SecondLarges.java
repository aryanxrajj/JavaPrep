package Assignment.GFG;

class SecondLargest {
    public static void main(String[] args) {


    }

    public static int getSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i = 0;i<arr.length;i++){
            int num = arr[i];
            if(num > firstLargest){
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num!=firstLargest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE ? -1 : secondLargest);
    }
}
