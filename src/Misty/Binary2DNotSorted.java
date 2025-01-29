package Misty;

public class Binary2DNotSorted {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        binarySearch(nums,10);
    }

    static void binarySearch(int[][] nums, int target) {
        int rs = 0,re = nums.length-1;
        int cs = 0, ce = nums[0].length-1;
        int Cmid = cs + (ce-cs)/2;

        while(rs<(re-1)) {
            int rmid = rs + (re - rs) / 2;
            if (nums[rmid][Cmid] < target) {
                rs = rmid;
            } else {
                re = rmid;
            }
        }

//        if(nums[rs][cs]>=target && nums[rs][ce]<=target){
//            return check(nums,rs,cs,ce,target);
//        }else{
//            return check(nums,rs+1,cs,ce,target);
//        }


    }

//    static void check(int[][] nums, int rs, int cs, int ce, int target) {
//        while(cs<=ce){
//            int mid = cs +(ce-cs);
//        }
//    }

}
