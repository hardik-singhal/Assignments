class reverse{   
 public static void main(String args[]){    
  int num=345,mod=0,rev=0,ori;
ori=num;
 while(num!=0)
 {
  mod=num%10;
  rev=rev*10+mod;
  num=num/10;
 }
  System.out.println(rev+" is reverse of "+ori);
 }
}