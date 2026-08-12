class Solution {
    public boolean isBoomerang(int[][] points) {
        // (y2-y1)/(x2-x1) = (y3-y2)/(x3-x2)

        // this is cross multiplication version which is safer , no x/0 or 0/0
        // (y2-y1) * (x3-x2) == (y3-y2) * (x2-x1)
        if((points[1][1]-points[0][1])*(points[2][0]-points[1][0])==(points[2][1]-points[1][1])*(points[1][0]-points[0][0])){
            return false;
        }
        return true;
    }
}