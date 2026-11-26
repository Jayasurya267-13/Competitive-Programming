class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int FirstNonRepeat=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num: arr){
            if(map.get(num)==1){
                FirstNonRepeat=num;
                break;
            }
        }
        System.out.print(FirstNonRepeat);
    }
}