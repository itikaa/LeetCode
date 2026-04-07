class Robot {
int width;
int height;
int x; int y;
int[][] dir;
int d;
    public Robot(int width, int height) {
    this.width=width;
    this.height=height;
     dir=new int[][]{ 
        {1,0} ,//East
        {0,1}, // North
        {-1,0}, // West
        {0,-1} //South
    };
    this.d=0; this.x=0; this.y=0;
    }
    
    public boolean safe(int x, int y){
        if(x>=0 && x<width && y>=0 &&  y<height){
     return true;
        }
        return false;
    }

    public void step(int num) {
        int cycle=2*(width+height-2);
        num = num % cycle;
        if(num == 0) num = cycle;
            for(int i=0;i<num;i++){
                int newX=x+ dir[d][0];
                int newY=y+ dir[d][1];
                if(safe(newX, newY)){
                    x=newX;
                    y=newY;
                }
                else{
                    while(!safe(newX, newY)){
                        d=(d+1)%4;
                        newX= x+ dir[d][0];
                        newY= y+ dir[d][1];
                    }
                    x=newX;
                    y=newY;
                }
        }
    }
    
    public int[] getPos() {
        return new int[]{x,y};
    }
    
    public String getDir() {
         if (d == 0) return "East";
        if (d == 1) return "North";
        if (d == 2) return "West";
        return "South";

    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */