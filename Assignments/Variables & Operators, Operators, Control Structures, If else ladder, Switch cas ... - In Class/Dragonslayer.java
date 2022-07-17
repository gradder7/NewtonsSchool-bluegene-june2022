static int DragonSlayer(int A, int B, int C,int D){
    //Enter your code here
        int x = C/B;
        if(C%B!=0){
            x++;
        }
        int y= A/D;
        if(A%D !=0){
            y++;
        }
        if(x<y){
            return 0;
        }
        return 1;
    }