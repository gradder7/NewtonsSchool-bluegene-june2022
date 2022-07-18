#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	 int size;
       
       cin>>n;
        int a=0,b=0;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                int p; 
                cin>>p;
                int x= (i+j)&1;
                if(p==x) 
                a+=1;
                if(p!=x)
                b+=1;

            }
        }
        if(a<b){
          cout<<c1;
        }
        else{
         cout<<b;
        }

	return 0;
}