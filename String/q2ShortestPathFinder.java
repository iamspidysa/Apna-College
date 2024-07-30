package String;

public class q2ShortestPathFinder {
    public static float Finder(String str){
        int x =0 , y=0;
        for (int i = 0; i < str.length(); i++) {
            char direction = str.charAt(i);
            if(direction=='E'){
                x++;
            }
            else if(direction=='W'){
                x--;
            }
            else if(direction=='N'){
                y++;
            }
            else if(direction=='S'){
                y--;
            }
        }
        int X2 = x*x , Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String dir = "SSSEEE";
        System.out.println(Finder(dir));
    }
}
