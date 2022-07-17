static int Knight(int X, int Y){
    //Ener your code here
    //int P[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    //int Q[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    // int n = 9;
    // int count = 0;
     //for (int i = 1; i < 9; i++) {
     //int x = X + P[i-1];
     //int y = Y + Q[i-1];
     //if (x >= 1 && y >= 1 && x < n && y < n)
     //count++;
     //}
     //return count;
    //}
    
    
    // second way
    int count =0;
    
    if(X>2){
        if(Y>1){
            count++;
        }   
    
        if(Y<8){
            count++;
        }
    
    }
    
    if(Y>2){
        if(X>1){
            count++;
        }   
    
        if(X<8){
            count++;
        }
    
    }
    
    if(X<7){
        if(Y>1){
            count++;
        }
        if(Y<8){
            count++;
        }
    }
    
    if(Y<7){
        if(X>1){
            count++;
        }
        if(X<8){
            count++;
        }
    }
    
    return count;
    }