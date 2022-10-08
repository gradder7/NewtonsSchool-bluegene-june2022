static char Race(int A,int B,int C){
    //Enter your code here
    if(Math.abs(C-A)== Math.abs(C-B)){
    return 'D';
    }
    else if(Math.abs(C-A)>Math.abs(C-B)){
    return 'S';}
    else{
    return 'N';}
    }