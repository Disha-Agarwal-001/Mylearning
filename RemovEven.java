class RemovEven {
     public static void main(String[] args) {        
        int MyArr[] = {2,3,4,5,6,7,0};
        for(int i=0; i<=7; i++) {
            System.out.println(MyArr[i]);
        }
        int oddCount = 0;
        for(int i=0; i<MyArr.length;i++) {
            if(MyArr[i] % 2 != 0) {
                oddCount++;
            }
        }
            int[] result=new int[oddCount];
            int idx=0;
            for(int i=0; i<MyArr.length;i++) {
                if(MyArr[i] % 2 != 0) {
                    result[idx] = MyArr[i];
                    idx++;
            }
        }
    }    
}