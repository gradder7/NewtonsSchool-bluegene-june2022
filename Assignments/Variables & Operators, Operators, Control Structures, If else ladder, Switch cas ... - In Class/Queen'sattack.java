static int QueenAttack(int X, int Y, int P, int Q){
    //Enter your code here
    if(X==P){// check row
        return 1;
    } else if(Y==Q){ // check column
        return 1;
    } 
     else if (Math.abs(X-P)==Math.abs(Y-Q))//((X==Y) && (P==Q))// 
     { // check diagonally
        return 1;
    }
    
     else {
        return 0;
    }
    }