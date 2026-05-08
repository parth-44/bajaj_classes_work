import java.util.*;
class flood_fill_algorithm {
   static  int n =0;
    static int m = 0 ;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        n = image.length;
        m = image[0].length;
        int start = image[sr][sc];
        if(image[sr][sc]==color) return image;
        dfs(image, sr, sc , color,start);
        return image;
    }
    static void dfs(int[][] image , int i , int j , int color , int pixel){
        if(i<0||i>=n||j<0||j>=m||image[i][j]!=pixel){
            return ;
        }
        image[i][j]=color;
        dfs(image,i+1,j,color,pixel);
        dfs(image,i-1,j,color,pixel);
        dfs(image,i,j+1,color,pixel);
        dfs(image,i,j-1,color,pixel);
    }

}