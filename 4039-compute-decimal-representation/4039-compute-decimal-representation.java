class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        if (n < 10) {
            return new int[] { n };

        }
        int count = 0;

        while (n > 0) {
            int ld=n%10;
            if(ld!=0) {
                int pow = (int) Math.pow(10, count);
                int ans = ld * pow;
                list.add(ans);
                
                

            }
             count++;
            n=n/10;

        }
        Collections.reverse(list);

        int[] arr = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            arr[i] = list.get(i);
            System.out.print(arr[i] + " ");

        }
        return arr;

    }
}