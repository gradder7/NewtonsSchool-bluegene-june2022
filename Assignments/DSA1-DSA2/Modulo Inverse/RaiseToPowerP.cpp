/* 
Raised to the power p
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary NxN matrix A. Return A raised to the power p.
Print each element of the matrix modulo 10^9+7.
Input
First line contains two numbers, N and P, denoting the size of the matrix A and the power it is raised to respectively
Next N lines contain N numbers each representing the elements of the matrix A.

Contraints
1 <= N <= 100
1 <= p <= 10^9
Aij is either 0 or 1
Output
Print matrix A raised to the power p, each element modulo (10^9+7)
Example
Input
3 4
1 0 0
1 1 1
0 1 0

Output
1 0 0
7 5 3
4 3 2
 */
 #include "bits/stdc++.h"

#pragma GCC optimize "03"

using namespace std;

#define ll long long int

#define ld long double

#define pi pair<int, int>

#define pb push_back

#define fi first

#define se second

#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)

#ifndef LOCAL

#define endl '\n'

#endif

const int N = 2e5 + 5;

const int mod = 1e9 + 7;

const int inf = 1e9 + 9;

int sz;

const int NN = 101;

class matrix{

public:

ll mat[NN][NN];

matrix(){

for(int i = 0; i < NN; i++)

for(int j = 0; j < NN; j++)

mat[i][j] = 0;

sz = NN;

}

inline matrix operator * (const matrix &a){

matrix temp;

for(int i = 0; i < sz; i++)

for(int j = 0; j < sz; j++){

for(int k = 0; k < sz; k++){

temp.mat[i][j] += (mat[i][k] * a.mat[k][j]) % mod;

if(temp.mat[i][j] >= mod)

temp.mat[i][j] -= mod;

}

}

return temp;

}

inline matrix operator + (const matrix &a){

matrix temp;

for(int i = 0; i < sz; i++)

for(int j = 0; j < sz; j++){

temp.mat[i][j] = mat[i][j] + a.mat[i][j] ;

if(temp.mat[i][j] >= mod)

temp.mat[i][j] -= mod;

}

return temp;

}

inline matrix operator - (const matrix &a){

matrix temp;

for(int i = 0; i < sz; i++)

for(int j = 0; j < sz; j++){

temp.mat[i][j] = mat[i][j] - a.mat[i][j] ;

if(temp.mat[i][j] < mod)

temp.mat[i][j] += mod;

}

return temp;

}

inline void operator = (const matrix &b){

for(int i = 0; i < sz; i++)

for(int j = 0; j < sz; j++)

mat[i][j] = b.mat[i][j];

}

inline void print(){

for(int i = 0; i < sz; i++){

for(int j = 0; j < sz; j++){

cout << mat[i][j] << " ";

}

cout << endl;

}

}

};

matrix pow(matrix a, ll k){

matrix ans;

for(int i = 0; i < sz; i++)

ans.mat[i][i] = 1;

while(k){

if(k & 1)

ans = ans * a;

a = a * a;

k >>= 1;

}

return ans;

}

signed main() {

IOS;

int n, p;

cin >> n >> p;

matrix m;

for(int i = 0; i < n; i++)

for(int j = 0; j < n; j++)

cin >> m.mat[i][j];

m = pow(m, p);

for(int i = 0; i < n; i++){

for(int j = 0; j < n; j++)

cout << m.mat[i][j] << " ";

cout << endl;

}

return 0;

}