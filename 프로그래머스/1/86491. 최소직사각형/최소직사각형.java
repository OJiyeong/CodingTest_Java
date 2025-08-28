class Solution {
    public int solution(int[][] sizes) {
        int wmax = 0, hmax = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(sizes[i][0] > wmax) wmax = sizes[i][0];
            if(sizes[i][1] > hmax) hmax = sizes[i][1];
        }
        
        return wmax * hmax;
        
        // Math.max()를 이용해서 다시 풀어보기
    }
}