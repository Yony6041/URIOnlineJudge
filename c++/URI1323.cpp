#include <iostream>
using namespace std;
int recursion(int a){
    if(a==1){
      return 1;
    }else{
      return (a*a) + recursion(a-1);
    }
}
int main(){
  int n;
  cin>>n;
  if(n!=0){
    cout << (recursion(n)) << "\n";
  }else{
    cout << "\n";
  }
  return 0;
}
